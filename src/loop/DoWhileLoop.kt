package loop

fun main() {


    var i = 10

    do {
        if (i % 2 == 0) {
            println(i)
        }

        i++
    } while (i <= 10)
}