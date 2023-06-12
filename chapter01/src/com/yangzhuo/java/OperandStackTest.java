package com.yangzhuo.java;

public class OperandStackTest {
    public void testAddOperation(){
        byte i=15;
        int j=8;
        int k=i+j;
    }

    public static void main(String[] args) {
        //第一类问题
        int i1=10;
        i1++;

        int i2=10;
        i2++;
        System.out.println("i1= "+i1);
        System.out.println("i2= "+i2);
        //第二类问题
        int i3=10;
        int i4=i3++;

        int i5=10;
        int i6=++i5;
        System.out.println("i4= "+i4);
        System.out.println("i6= "+i6);
        //第三类问题
        int i7=10;
        i7=i7++;

        int i8=10;
        i8=++i8;
        System.out.println("i7= "+i7);
        System.out.println("i8= "+i8);
        //第四类问题
        int i9=10;
        int i10=i9++ + ++i9;
        System.out.println("i9= "+i9);
        System.out.println("i10= "+i10);

    }
}
