package com.intuit.tank.vm.common.util;

/*
 * #%L
 * Intuit Tank Api
 * %%
 * Copyright (C) 2011 - 2015 Intuit Inc.
 * %%
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * #L%
 */

import org.junit.jupiter.api.*;

import com.intuit.tank.vm.common.util.ValidationUtil;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The class <code>ValidationUtilCpTest</code> contains tests for the class <code>{@link ValidationUtil}</code>.
 * 
 * @generatedBy CodePro at 9/3/14 3:41 PM
 */
public class ValidationUtilCpTest {
    /**
     * Run the ValidationUtil() constructor test.
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testValidationUtil_1()
            throws Exception {
        ValidationUtil result = new ValidationUtil();
        assertNotNull(result);
    }

    /**
     * Run the boolean isAnyVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsAnyVariable_1()
            throws Exception {
        String key = "";

        boolean result = ValidationUtil.isAnyVariable(key);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isAnyVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsAnyVariable_2()
            throws Exception {
        String key = "aa";

        boolean result = ValidationUtil.isAnyVariable(key);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isAnyVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsAnyVariable_3()
            throws Exception {
        String key = "aa";

        boolean result = ValidationUtil.isAnyVariable(key);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isAnyVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsAnyVariable_4()
            throws Exception {
        String key = "aa";

        boolean result = ValidationUtil.isAnyVariable(key);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isAnyVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsAnyVariable_5()
            throws Exception {
        String key = "aa";

        boolean result = ValidationUtil.isAnyVariable(key);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isFunction(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsFunction_1()
            throws Exception {
        String function = "";

        boolean result = ValidationUtil.isFunction(function);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isFunction(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsFunction_2()
            throws Exception {
        String function = "#function";

        boolean result = ValidationUtil.isFunction(function);

        assertEquals(true, result);
    }

    /**
     * Run the boolean isFunction(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsFunction_3()
            throws Exception {
        String function = "";

        boolean result = ValidationUtil.isFunction(function);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsVariable_1()
            throws Exception {
        String key = "";

        boolean result = ValidationUtil.isVariable(key);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsVariable_2()
            throws Exception {
        String key = "aa";

        boolean result = ValidationUtil.isVariable(key);

        assertEquals(false, result);
    }

    /**
     * Run the boolean isVariable(String) method test.
     * 
     * @throws Exception
     * 
     * @generatedBy CodePro at 9/3/14 3:41 PM
     */
    @Test
    public void testIsVariable_3()
            throws Exception {
        String key = "aa";

        boolean result = ValidationUtil.isVariable(key);

        assertEquals(false, result);
    }

}