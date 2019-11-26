package OOP


fun main() {

    var dog = Dog()
    dog.eat()

    var cat = Cat()
    cat.eat()

    var animal=Animal()
    animal.eat()
}

open class Animal {

    var color: String = ""
   open fun eat() {
        println("Animal eating")
    }
}

class Dog : Animal() {

    var age: Int = -1
    fun bark() {
        println("meow")
    }

   override fun eat(){
        println("Dog eating...")

    }
}

class Cat : Animal() {

    var breed: String = ""

    fun meow() {
        println("meow")
    }

    override fun eat(){
        println("Cat eating...")

    }
}