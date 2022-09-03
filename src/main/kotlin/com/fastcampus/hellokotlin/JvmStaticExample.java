package com.fastcampus.hellokotlin;

public class JvmStaticExample {
    public static void main(String[] args) {

//        String hello = HelloClass.Companion.hellO();
//        String hi = HiObject.INSTANCE.hi();

        String hello = HelloClass.hellO();
        String hi = HiObject.hi();

        System.out.println(hello);
        System.out.println(hi);
    }
}
