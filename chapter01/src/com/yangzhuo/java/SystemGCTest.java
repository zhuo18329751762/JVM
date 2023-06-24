package com.yangzhuo.java;

public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        System.gc();
        System.runFinalization();//强制调用引用对象的finalize()方法
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("SystemGCTest 重写了finalize()");
    }
}
