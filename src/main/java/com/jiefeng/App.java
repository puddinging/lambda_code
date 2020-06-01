package com.jiefeng;

import com.jiefeng.demo.Sum;
import com.jiefeng.utils.FunctionTest;


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

        boolean b = f.functionTest4(t -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(System.currentTimeMillis());
            }
            return t == 1;
        }, 1);
        System.out.println(b);
//        step over 跳过当前代码
//        step into 进入当前代码
//        step out  跳出当前函数
//        resume 恢复程序到下一个断点
//        run to curse 跳到当前鼠标位置
//        fource step into 强制进入
    }

}
