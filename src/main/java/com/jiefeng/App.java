package com.jiefeng;

import com.jiefeng.utils.FunctionTest;
import com.jiefeng.demo.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        FunctionTest<Integer, Integer> f = new FunctionTest<>();
        // 在此将方法作为返回值传入
        for (int i = 0; i < 1000000; i++) {
            System.out.println(f.functionTest(Sum::sum, 99999999));

        }
    }
}
