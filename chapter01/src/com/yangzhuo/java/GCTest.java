package com.yangzhuo.java;

import java.util.ArrayList;
import java.util.List;

public class GCTest {
    public static void main(String[] args) throws InterruptedException {
        int i=0;
        Thread.sleep(3000000);
        try{
            List<String> list=new ArrayList<>();
            String a="itcast.com";
            while (true){
                list.add(a);
                a=a+a;
                i++;
            }
        }catch (Throwable t){
            t.printStackTrace();
            System.out.println("遍历次数为: "+i);
        }
    }
}
