package function

fun main() {


    var maxValue = max(5, 6)

    println(" The grater number is = $maxValue")

    var maxValue2 = max2(5, 6)

    println(" The grater number is = $maxValue2 by optimized function")
}

// unoptimized
fun max(a: Int, b: Int): Int {

    if (a > b)
        return a
    else
        return b
}

// optimized
fun max2(a: Int, b: Int): Int = if (a > b) a else b