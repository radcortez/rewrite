/*
 * Copyright 2021 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.java;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.openrewrite.ExecutionContext;
import org.openrewrite.Option;
import org.openrewrite.Recipe;
import org.openrewrite.Tree;
import org.openrewrite.internal.StringUtils;
import org.openrewrite.internal.lang.Nullable;
import org.openrewrite.java.tree.J;
import org.openrewrite.java.tree.JavaType;
import org.openrewrite.java.tree.JavaType.Primitive;
import org.openrewrite.java.tree.Space;
import org.openrewrite.java.tree.TypeUtils;
import org.openrewrite.marker.Markers;

@Value
@EqualsAndHashCode(callSuper = false)
public class ReplaceConstant extends Recipe {
    @Option(displayName = "Owning type of the constant",
            description = "The target type in which the constant to be replaced is defined.",
            example = "com.google.common.base.Charsets")
    String owningType;

    @Option(displayName = "Constant name",
            description = "The name of the constant field to replace.",
            example = "UTF_8")
    String constantName;

    @Option(displayName = "Literal value",
            description = "The literal value to replace.",
            example = "UTF_8")
    String literalValue;

    @Override
    public String getDisplayName() {
        return "Replace constant with literal value";
    }

    @Override
    public String getDescription() {
        return "Replace a named constant with a literal value when you wish to remove the old constant.";
    }

    @Override
    protected JavaVisitor<ExecutionContext> getVisitor() {
        return new JavaVisitor<ExecutionContext>() {
            @Override
            public J visitFieldAccess(J.FieldAccess fieldAccess, ExecutionContext executionContext) {
                if (isConstant(fieldAccess.getName().getFieldType())) {
                    maybeRemoveImport(owningType);
                    return buildLiteral().withPrefix(fieldAccess.getPrefix());
                }
                return super.visitFieldAccess(fieldAccess, executionContext);
            }

            @Override
            public J visitIdentifier(J.Identifier ident, ExecutionContext executionContext) {
                if (isConstant(ident.getFieldType())) {
                    maybeRemoveImport(owningType);
                    return buildLiteral().withPrefix(ident.getPrefix());
                }
                return super.visitIdentifier(ident, executionContext);
            }

            private boolean isConstant(@Nullable JavaType.Variable varType) {
                return varType != null && TypeUtils.isOfClassType(varType.getOwner(), owningType) &&
                        varType.getName().equals(constantName);
            }

            private J.Literal buildLiteral() {
                Object value = literalValue;
                Primitive type;
                if(literalValue.startsWith("\"")) {
                    value = literalValue.substring(0, literalValue.length() - 1);
                    type = Primitive.String;
                } else if(literalValue.startsWith("'")) {
                    value = literalValue.substring(0, literalValue.length() - 1);
                    type = Primitive.Char;
                } else if(StringUtils.isNumeric(literalValue)) {
                    value = Integer.parseInt(literalValue);
                    type = Primitive.Int;
                } else if(StringUtils.isNumeric(literalValue.replace(".", ""))) {
                    value = Double.parseDouble(literalValue);
                    type = Primitive.Double;
                } else {
                    throw new IllegalArgumentException("Unknown literal type for literal value: " + literalValue);
                }

                return new J.Literal(Tree.randomId(), Space.EMPTY, Markers.EMPTY,
                        value, literalValue, null, type);
            }
        };
    }
}
