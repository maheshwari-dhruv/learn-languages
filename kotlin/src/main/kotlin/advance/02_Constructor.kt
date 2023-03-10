package advance

class User(var firstName: String, var lastName: String) {

    constructor(firstName: String): this(firstName, "") {
        println("Hello")
    }

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $lastName")
    }

    fun updateFirstName(newName: String) {
        firstName = newName
    }

    fun firstNameLength(): Int {
        return firstName.length
    }

    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName')"
    }
}

fun main() {
    val u1: User = User("Dhruv", "Maheshwari")
    u1.printFullName()
    val toString: String = u1.toString()
    println(toString)
    val u2: User = User("Dhruv")
    u2.printFullName()
    val toString2: String = u2.toString()
    println(toString2)
}