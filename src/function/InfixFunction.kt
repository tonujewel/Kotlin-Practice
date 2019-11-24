package function


fun main() {


    var x:Int = 50
    var y:Int = 10

    var value = x greaterValue1 y

    println("Greater value is $value")

}

infix fun Int.greaterValue1 (otherValue:Int):Int{

    if (this>otherValue)
        return this
    else
        return otherValue
}

