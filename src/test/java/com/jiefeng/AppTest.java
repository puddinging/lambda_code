package com.jiefeng;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        System.out.println("hello world");
        assertTrue(true);
    }

    @Test
    public  void test() {
        int a = 3;
        assert(a == 10);
        System.out.println("x");
    }
}
