package condition

fun main(args: Array<String>) {


    var a = 2
    var b = 3


    var maxValue: Int

    // tripical if condition

    if (a > b)
        maxValue = a
    else
        maxValue = b

    println("tripical" + maxValue)

    var maxValues: Int = if (a > b) {
        print("$a is bigger ")
        a
    } else {
        print("$b is bigger ")
        b
    }
}