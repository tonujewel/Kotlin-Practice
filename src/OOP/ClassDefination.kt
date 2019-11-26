package OOP

fun main() {

    var student = Student("Jewel Rana")

}

class Student(name: String) {

    var name: String = "Dymmy"

    init {
        println("init Student Name is ${name}")
    }
}