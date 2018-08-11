package com.meituan.test;

public class Test {
    @Override
    public int hashCode() {
        System.out.println("第一个增加");
        System.out.println("第二个增加");
        return super.hashCode();
    }
}
