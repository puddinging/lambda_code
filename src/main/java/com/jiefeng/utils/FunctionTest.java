package com.jiefeng.utils;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * FunctionTest 用于测试写的方法运行时长
 */
public class FunctionTest<T, R> {
    /**
     * 在此将需要实现的代码以及需要传入的代码传入
     * 
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

    /**
     * 消费型接口，一个参数无返回值
     * 
     * @param consumer
     * @param t
     */
    public void functionTest2(Consumer<T> consumer, T t) {
        long beforeTime = System.currentTimeMillis();
        consumer.accept(t);
        long afterTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (afterTime - beforeTime));
    }

    /**
     * 供给型接口，无参数一个返回值
     * 
     * @param supplier
     * @return
     */
    public R functionTest3(Supplier<R> supplier) {
        long beforeTime = System.currentTimeMillis();
        R r = supplier.get();
        long afterTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (afterTime - beforeTime));
        return r;
    }

    /**
     * 断言型接口，一个参数，返回值是布尔值
     * 
     * @param predicate
     * @param t
     * @return
     */
    public boolean functionTest4(Predicate<T> predicate, T t) {
        long beforeTime = System.currentTimeMillis();
        boolean is = predicate.test(t);
        long afterTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (afterTime - beforeTime));
        return is;
    }
}