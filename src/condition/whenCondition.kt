package condition

fun main(args: Array<String>) {


    val x = 3

    var str: String = when (x) {

        1, 3 -> {

            "x is one or 3"

        }

        in 1..5 -> {

            println("x lies in 1  to 5")
            "x lies in 1  to 5"
        }

        2 -> "x is 2"

        else -> {
            "x value is unknown "
            "I don't know the x value  "

        }
    }

    println(str)
}