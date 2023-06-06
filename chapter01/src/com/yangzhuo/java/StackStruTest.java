package com.yangzhuo.java;

public class StackStruTest {
    public static void main(String[] args) {
        int i=2+3;
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取其上层，扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);//sun.misc.Launcher$ExtClassLoader@75b84c92

        //获取其上层
        ClassLoader bootstrapClassLoader = parent.getParent();
        System.out.println(bootstrapClassLoader);//null

        //对于用户自定义类来说，默认使用系统类加载器进行加载
        ClassLoader classLoader = StackStruTest.class.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类使用引导类加载器进行加载-->java的核心类库都是使用引导类加载器进行加载的
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);//null
    }
}
