package com.fastcampus.hellokotlin


class HelloClass {

    companion object {
        @JvmStatic
        fun hellO() = "hello"
    }
}

object  HiObject {
    @JvmStatic
    fun hi() = "hi!"
}

fun main() {
    val hello = HelloClass.hellO()

    val hi = HiObject.hi()
}