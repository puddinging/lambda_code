package com.jiefeng;

import static org.junit.Assert.assertTrue;

import com.definesys.mpaas.query.util.MpaasQueryUtil;

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
        System.out.println("hello w orld");
        assertTrue(true);
    }

    @Test
    public  void test() {
        System.out.println(MpaasQueryUtil.decryptRowId("2UVA2L4HJ2KRSKBOV6WD5BI45Q", "1234567890ABCDEF"));
    }
}
