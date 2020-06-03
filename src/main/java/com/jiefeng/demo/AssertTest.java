package com.jiefeng.demo;

public class AssertTest {
    public static void main(String[] args) {
        String PASSWORD_FORMAT_CHECK = "^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]{8,32})$";
        System.out.println(PASSWORD_FORMAT_CHECK.matches("wjf15963222"));
        System.out.println("wjf159632".matches(PASSWORD_FORMAT_CHECK));
    }
}
