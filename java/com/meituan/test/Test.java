package com.meituan.test;

public class Test {
    @Override
    public int hashCode() {
        System.out.println("第一个增加");
        System.out.println("第二个增加");
        System.out.println("第三次增加");
        System.out.println("最后一次");
        return super.hashCode();
    }
}
