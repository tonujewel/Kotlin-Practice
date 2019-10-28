import com.Person2

fun main(args: Array<String>) {

    var myName = "Jewel Rana"

    display()

    showResult("Show result with parameter >> $myName")

    var personObg = Person()
    personObg.showResult(myName)


    var  person2 = Person2("jewel rana")
    person2.result()


}

fun showResult(name: String) {

    println(name)
}


fun display() {

    println("Print from display function")
}

class Person {

    fun showResult(name: String) {

        println("Showing from class >> $name")
    }

}