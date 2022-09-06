package com.fastcampus.hellokotlin



fun main() {

    val person = Person()

    //자바 스타일
//    person.setName("토니스타크")
//    person.setAge(44)
//    person.setAddress("스타크타워")
//
//    println(person.getName())
//    println(person.getAge())

    // 코틀린 스타일
    person.name = "토니스타크"
    person.age = 44
    //person.address = "스타크타워"
    println(person.age)
    println(person.name)

    // 프로퍼티가 없음에도 게터 메서드라면 프로퍼티처럼 사용 가능하다.
    println(person.uuid)

    // 세터가 있음에도 컴파일 오류가 발생한다.
    //person.address = ""
    person.setAddress("용인시 기흥구")

    // address를 가져오는 메서드를 게터가 아닌 my로 했기 때문에 세터도 생성되지 않는다.
    println(person.myAddress())




}