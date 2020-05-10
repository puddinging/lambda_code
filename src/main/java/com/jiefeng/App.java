package com.jiefeng;

import com.definesys.mpaas.query.util.MpaasQueryUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(MpaasQueryUtil.encryptRowId(9, "1234567890ABCDEF"));
    }
}
