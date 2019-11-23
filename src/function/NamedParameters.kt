package function

fun main() {
    println("As usual fuction call")
    findVolume(10, 15, 10)

// aapling named parameter
    println("\nfunction call with named parameter")
    findVolume(length = 10, breadth = 15, heighit = 10)

    // showing as above
    println("\nfunction call with named parameter and change sequence ")
    findVolume(breadth = 15, length = 10, heighit = 10)

}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, heighit: Int = 5) {

    println("Length is $length")
    println("Breadth is $breadth")
    println("Heighit is $heighit")
}