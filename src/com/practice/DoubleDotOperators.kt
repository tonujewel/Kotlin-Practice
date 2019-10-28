package com.practice

fun main (args:Array<String>){

    val r1 = 1..5

    val r2 = 5 downTo  1

    val r3 = 5 downTo 1 step 2

    val r4 = 'a'..'z'


    val isPresent = 'c' in r4

    println(isPresent)

    var countDown = 10.downTo(1)

    var countUp = 1.rangeTo(10)

    var isPresen2 =  50 in countDown

    println(isPresen2)

}