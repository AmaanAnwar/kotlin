/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithVariadicGenerics")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsTestWithVariadicGenericsGenerated extends AbstractDiagnosticsTestWithVariadicGenerics {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInTestsWithVariadicGenerics() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithVariadicGenerics"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("boxed.kt")
    public void testBoxed() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/boxed.kt");
    }

    @TestMetadata("emptyArgumentList.kt")
    public void testEmptyArgumentList() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/emptyArgumentList.kt");
    }

    @TestMetadata("errorNoWrapper.kt")
    public void testErrorNoWrapper() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/errorNoWrapper.kt");
    }

    @TestMetadata("incorrectCalls.kt")
    public void testIncorrectCalls() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/incorrectCalls.kt");
    }

    @TestMetadata("incorrectModifiers.kt")
    public void testIncorrectModifiers() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/incorrectModifiers.kt");
    }

    @TestMetadata("materialize.kt")
    public void testMaterialize() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/materialize.kt");
    }

    @TestMetadata("varargDeclarations.kt")
    public void testVarargDeclarations() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/varargDeclarations.kt");
    }

    @TestMetadata("varargFunctionTypeInference.kt")
    public void testVarargFunctionTypeInference() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/varargFunctionTypeInference.kt");
    }

    @TestMetadata("varargLambdaTypeInference.kt")
    public void testVarargLambdaTypeInference() throws Exception {
        runTest("compiler/testData/diagnostics/testsWithVariadicGenerics/varargLambdaTypeInference.kt");
    }
}