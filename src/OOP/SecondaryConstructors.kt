package OOP


fun main() {

    var student = Student1("Jewel Rana",10)

    println(student.id)

}

class Student1(name: String) {

    var id:Int = -1
    var name: String = "Dymmy"

    init {
        println("init Student Name is ${name}")
    }

    constructor(n:String,id:Int):this(n){
        this.id=id
    }
}