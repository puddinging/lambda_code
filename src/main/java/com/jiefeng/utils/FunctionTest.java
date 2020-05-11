package com.jiefeng.utils;

import java.util.function.Function;

/**
 * FunctionTest
 */
public class FunctionTest<T, R> {
    /**
     * 在此将需要实现的代码以及需要传入的代码传入
     * @param f
     * @param t
     * @return
     */
    public R functionTest(Function<T, R> f, T t) {
        long beforeTime = System.currentTimeMillis();
        R r = f.apply(t);
        long afterTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (afterTime - beforeTime));
        return r;
    }
}