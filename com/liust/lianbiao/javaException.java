package com.liust.lianbiao;

/**
 * @program: lianbiao
 * @description: java异常
 * @author: liust
 * @create: 2018-04-16 15:59
 **/
public class javaException {
    public static void main(String[] args) {
        System.out.println(getException());
    }

    public static int getException() {
        try {
            return 1 / 0;
        } catch (Exception e) {
            return -1;
        } finally {
            System.out.println("finally");
            return -121;
        }

    }
}
