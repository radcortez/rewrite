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
package org.openrewrite.yaml

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import org.openrewrite.Issue
import java.nio.file.Path

class DeleteKeyTest : YamlRecipeTest {
    @Test
    fun deleteNestedKey() = assertChanged(
        recipe = DeleteKey("$.metadata.name", null),
        before = """
            apiVersion: v1
            metadata:
              name: monitoring-tools
              namespace: monitoring-tools
        """,
        after = """
            apiVersion: v1
            metadata:
              namespace: monitoring-tools
        """
    )

    @Test
    fun deleteRelativeKey() = assertChanged(
        recipe = DeleteKey(".name", null),
        before = """
            apiVersion: v1
            metadata:
              name: monitoring-tools
              namespace: monitoring-tools
        """,
        after = """
            apiVersion: v1
            metadata:
              namespace: monitoring-tools
        """
    )

    @Test
    fun deleteSequenceEntry() = assertChanged(
        recipe = DeleteKey("$.subjects[?(@.kind == 'User')]", null),
        before = """
            subjects:
              - kind: User
                name: some-user
                restore-keys: |
                  gradle
              - kind: ServiceAccount
                name: monitoring-tools
        """,
        after = """
            subjects:
              - kind: ServiceAccount
                name: monitoring-tools
        """
    )

    @Test
    fun deleteSequenceKeyByWildcard() = assertChanged(
        recipe = DeleteKey("$.subjects[*].kind", null),
        before = """
            subjects:
              - kind: User
                name: some-user
              - kind: ServiceAccount
                name: monitoring-tools
        """,
        after = """
            subjects:
              - name: some-user
              - name: monitoring-tools
        """
    )

    @Test
    fun deleteSubSequenceKeyByExactMatch() = assertChanged(
        recipe = DeleteKey("$.subjects[?(@.kind == 'ServiceAccount')].kind", null),
        before = """
            subjects:
              - kind: User
                name: some-user
              - kind: ServiceAccount
                name: monitoring-tools
        """,
        after = """
            subjects:
              - kind: User
                name: some-user
              - name: monitoring-tools
        """
    )

    @Test
    @Issue("https://github.com/openrewrite/rewrite/issues/1175")
    fun deleteNestedKeyRemovingUnusedKeysRecursively() = assertChanged(
        recipe = DeleteKey("$.b.c.d", null),
        before = """
            a: a-value
            b:
              c:
                d: d-value
        """,
        after = """
            a: a-value
        """
    )

    @Test
    @Issue("https://github.com/openrewrite/rewrite/issues/1175")
    @Disabled
    fun deleteKeyKeepingUnrelatedUnusedKeys() = assertChanged(
        recipe = DeleteKey("$.jobs.build.strategy.fail-fast", null),
        before = """
            on:
              push:
                branches:
                  - main
                tags-ignore:
                  - "*"
              pull_request:
                branches:
                  - main
              workflow_dispatch: {}
              schedule:
                - cron: 0 18 * * *
            jobs:
              build:
                strategy:
                  fail-fast: false
                  matrix:
                    java: ["11"]
                    os: ["ubuntu-latest"]
        """,
        after = """
            on:
              push:
                branches:
                  - main
                tags-ignore:
                  - "*"
              pull_request:
                branches:
                  - main
              workflow_dispatch: {}
              schedule:
                - cron: 0 18 * * *
            jobs:
              build:
                strategy:
                  matrix:
                    java: ["11"]
                    os: ["ubuntu-latest"]
        """
    )

    @Test
    fun changeOnlyMatchingFile(@TempDir tempDir: Path) {
        val matchingFile = tempDir.resolve("a.yml").apply {
            toFile().parentFile.mkdirs()
            toFile().writeText("apiVersion: v1")
        }.toFile()
        val nonMatchingFile = tempDir.resolve("b.yml").apply {
            toFile().parentFile.mkdirs()
            toFile().writeText("apiVersion: v1")
        }.toFile()
        val recipe = DeleteKey(".apiVersion", "**/a.yml")
        assertChanged(recipe = recipe, before = matchingFile, after = "")
        assertUnchanged(recipe = recipe, before = nonMatchingFile)
    }
}
