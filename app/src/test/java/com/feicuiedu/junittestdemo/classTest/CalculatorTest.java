package com.feicuiedu.junittestdemo.classTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 123 on 2016/10/25.
 * 生成的测试类
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(3,calculator.sum(1,2),0);
    }

    @Test
    public void substract() throws Exception {
        assertEquals(2,calculator.substract(5,3),0);
    }

    @Test
    public void divide() throws Exception {

    }

    @Test
    public void multiply() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
}