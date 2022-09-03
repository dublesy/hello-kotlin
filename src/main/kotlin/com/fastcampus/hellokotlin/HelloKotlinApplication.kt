package com.fastcampus.hellokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloKotlinApplication

fun main(args: Array<String>) {
	runApplication<HelloKotlinApplication>(*args)
}