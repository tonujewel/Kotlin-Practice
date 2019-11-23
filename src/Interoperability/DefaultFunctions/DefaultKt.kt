package Interoperability.DefaultFunctions

fun main() {

    var result = findVolume(10, 15)

    println(result)

}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, heighit: Int = 5): Int {

    return length * breadth * heighit
}