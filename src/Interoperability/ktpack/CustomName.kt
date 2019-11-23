@file:JvmName("MyCustomKotlinName")

package Interoperability.ktpack

import Interoperability.javapac.MyJavaClass

fun main() {

    var area = MyJavaClass.ractangle(5,5)

    println("Printing from KT class area is $area")

}

fun add2(a: Int, b: Int): Int {

    return a + b
}