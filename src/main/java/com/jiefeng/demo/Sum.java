package com.jiefeng.demo;

public class Sum {
    /**
     * 在此实现自己的代码，需要和当作参数传入的接口方法参数返回值一致
     * 
     * @param i
     * @return
     */
    public static Integer sum(Integer i) {
        int x = 0;
        for (int j = 0; j < i; j++) {
            x = j;
        }
        return Integer.valueOf(x);
    }
}