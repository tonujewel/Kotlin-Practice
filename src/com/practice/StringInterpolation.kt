package com.practice

fun main(args: Array<String>) {


    var name = "jewel Rana"

    println("My name is ${name}")
    println("My name is $name")


    var rectangle = Rectangle()

    println("the length is ${rectangle.length} and breadth is ${rectangle.breadth} . The area is ${rectangle.length * rectangle.breadth}")

}

class Rectangle {


    var length: Int = 10
    var breadth: Int = 40


}