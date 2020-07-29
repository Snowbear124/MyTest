package com.tom

import com.sun.org.apache.xpath.internal.operations.String

fun main() {
//    println("Hello kotlin");
//    Human().hello();
    val h = Human();
    h.hello();
    val age = 19;   //val定義不可改變
    var weight = 66.5f;  //var定義可以改變
    var name : kotlin.String; //String可能因版本而有所不同
    name = "Hank";
}

class Human {
    fun hello() {
        println("Hello Kotlin");
    }
}