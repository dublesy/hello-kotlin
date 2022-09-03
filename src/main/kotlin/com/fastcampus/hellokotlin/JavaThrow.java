package com.fastcampus.hellokotlin;

import java.io.IOException;

public class JavaThrow {
    public void throwIOException() throws IOException {
        throw new IOException("체크드 익셉션인 IOException 발생");
    }

    public static void main(String[] args) {

//        JavaThrow javaThrow = new JavaThrow();
//        try {
//            javaThrow.throwIOException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 자바에서 코틀린 Throw 가 전파되지 않음. 전파되게 하기 위해서 코틀린 클래스에 @kotlin.jvm.Throws 어노테이션을 사용하면 된다.
        try {
            KotlinThrow kotlinThrow = new KotlinThrow();
            kotlinThrow.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
