package com.fastcampus.hellokotlin

class JvmFieldClass {

    companion object {
        @JvmField
        val id = 1234
        const val CODE = 1234
    }
}

object JvmFieldObject {
    @JvmField
    val name = "tony"
    const val FAMILY_NAME = "tony"
}

fun main() {
    val id = JvmFieldClass.id
    val name = JvmFieldObject.name
}