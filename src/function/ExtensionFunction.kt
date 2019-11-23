package function

fun main() {

    var mark = 70
    var student = Student()

    println("Eligible for next class ? ans is  ${student.isPassed(mark)}")
    println("Eligible for Schoolarship ? ans is  ${student.isSchoolar(mark)}")

    var str1: String = "Hello "
    var str2: String = "World"
    var str3: String = "Hey "

    println(str3.add(str1,str2))

    var x:Int = 50
    var y:Int = 10

    var value = x.greaterValue(y)

    println("Greater value is $value")

}

fun Int.greaterValue (otherValue:Int):Int{

    if (this>otherValue)
        return this
    else
        return otherValue
}


fun String.add(s1: String, s2: String): String {

    return this +s1 + s2
}


fun Student.isSchoolar(marks: Int): Boolean {

    return marks > 80
}

class Student {

    fun isPassed(marks: Int): Boolean {

        return marks > 40

    }
}