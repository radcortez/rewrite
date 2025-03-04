/*
 * Copyright 2020 the original author or authors.
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
package org.openrewrite.xml;

import org.openrewrite.Cursor;
import org.openrewrite.internal.lang.Nullable;
import org.openrewrite.xml.search.FindIndentXmlVisitor;
import org.openrewrite.xml.tree.Xml;

import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static java.util.stream.IntStream.range;

public class AutoFormatVisitor<P> extends XmlVisitor<P> {

    private final Xml.Tag[] scope;

    public AutoFormatVisitor(Xml.Tag... scope) {
        this.scope = scope;
    }

    @Nullable
    private FindIndentXmlVisitor<P> findIndent = null;

    @Override
    public Xml preVisit(Xml tree, P p) {
        Xml x = super.preVisit(tree, p);
        if (x != null) {
            String prefix = x.getPrefix();
            if (prefix.contains("\n") && (scope.length == 0 || stream(scope).anyMatch(s -> getCursor().isScopeInPath(s)))) {
                int indentMultiple = (int) getCursor().getPathAsStream().filter(Xml.Tag.class::isInstance).count() - 1;
                if(getCursor().getValue() instanceof Xml.Attribute ||
                        getCursor().getValue() instanceof Xml.CharData ||
                        getCursor().getValue() instanceof Xml.Comment){
                    indentMultiple++;
                }
                findIndent = getIndent(getCursor(), p);
                int indentToUse = findIndent.getMostCommonIndent() > 0 ?
                        findIndent.getMostCommonIndent() : 4; /* default to 4 spaces */

                String shiftedPrefix = prefix.substring(0, prefix.lastIndexOf('\n') + 1) + range(0, indentMultiple * indentToUse)
                        .mapToObj(n -> findIndent.isIndentedWithSpaces() ? " " : "\t")
                        .collect(Collectors.joining(""));

                if (!shiftedPrefix.equals(prefix)) {
                    return x.withPrefix(shiftedPrefix);
                }
            }
        }
        return x;
    }

    private FindIndentXmlVisitor<P> getIndent(Cursor c, P p) {
        if(findIndent == null) {
            while(c.getParent() != null && c.getParent().getValue() instanceof Xml.Tag) {
                c = c.getParent();
            }
            findIndent = new FindIndentXmlVisitor<>(0);
            findIndent.visit((Xml.Tag) c.getValue(), p);
        }
        return findIndent;
    }
}
