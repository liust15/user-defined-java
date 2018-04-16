package com.liust.lianbiao;

/**
 * @program: lianbiao
 * @description: 基本数据类型包装类
 * @author: liust
 * @create: 2018-04-16 12:34
 **/
public class BaseClass {
    public static void main(String[] args) {
        //基本数据类型转换为包装类，成为自动装箱
        Integer i1 = new Integer(10);
        //包装类转换为基本数据类型，成为自动拆箱
        int i2 = i1.intValue();

        Integer i3 = 10;//建议使用
        Integer i4 = new Integer("10");
        mianshiti();
    }

    public static void mianshiti() {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        System.out.println(i1 == i2);//false
        System.out.println(i1.equals(i2));//true
        Integer i3 = new Integer(128);
        Integer i4 = new Integer(128);
        System.out.println(i3 == i4);//f
        System.out.println(i3.equals(i4));//true
        Integer i5 = 10;
        Integer i6 = 10;
        System.out.println(i5 == i6);//true
        System.out.println(i5.equals(i6));//true
        //享元模式，java会自动缓存一个字节以内的数
        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);//false
        System.out.println(i3.equals(i4));//true
        Integer i9 = 127;
        Integer i10 = 127;
        System.out.println(i9 == i10);//true
        System.out.println(i9.equals(i10));//true
        int x1 = 128;
        int x2= 128;
        System.out.println(x1 == x2);//true
       // System.out.println(x1.equals(x2));//true
    }

}
/*
面试题：


*/