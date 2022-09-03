package com.fastcampus.hellokotlin;

public class ExtentionExample {

    public static void main(String[] args) {
//        "ABCD".first();
//        "ABCD".addFirst('Z');

        char first = ExtentionsKt.first("ABCD");
        System.out.println("first = " + first);


        String addFirst = ExtentionsKt.addFirst("ABCD", 'Z');
        System.out.println("addFirst = " + addFirst);

    }


}
