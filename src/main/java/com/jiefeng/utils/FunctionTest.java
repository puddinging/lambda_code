package com.jiefeng.utils;

import java.util.function.Function;

/**
 * FunctionTest
 */
public class FunctionTest<T, R> {
    public R functionTest(Function<T, R> f, T t) {
        return f.apply(t);
    }

    public static void main(String[] args) {
        FunctionTest<Integer, Integer> f = new FunctionTest<>();
        System.out.println(f.functionTest(x -> {
            long beforeTime = System.currentTimeMillis();
            int a = 10;
            for (int i = 0; i < 100000; i++) {
                a = i;
            }
            long afterTime = System.currentTimeMillis();
            System.out.println(afterTime - beforeTime);
            return a;
        }, 100));
    }
}