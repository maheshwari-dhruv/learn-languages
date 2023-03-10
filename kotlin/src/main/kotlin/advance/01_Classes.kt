package advance

class Profile {
    var name: String = ""
    var age: Int = 0
}

class Student(var name: String, var age: Int) {
    fun display() {
        println("Student Name: $name | Age: $age")
    }
}

// open keyword is used for inheritance
open class World {
    var name: String = "Hello"
}

class Hello: World() {
    fun displayMssg() {
        println("$name World")
    }
}

fun main() {
    val p1: Profile = Profile()
    p1.name = "Dhruv"
    p1.age = 21

    println("Name: ${p1.name} | Age: ${p1.age}")

    val s1: Student = Student("Dhruv", 21)
    s1.display()
    println("Name: ${s1.name} | Age: ${s1.age}")

    val obj: Hello = Hello()
    obj.displayMssg()
}