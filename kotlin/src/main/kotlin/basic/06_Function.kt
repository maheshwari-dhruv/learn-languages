package basic

fun main() {
    println("Hello World") // pre-defined function
    myFunction() // user-defined function
    myFunction("Dhruv") // Parametrised user-defined function with function overloading
    myFunction("Dhruv", 21) // Multiple Parameters

    var result = myFunction(10) // user-defined function with return type
    println(result)

    result = myFunction(10, 20) // short-hand syntax
    println(result)
}

fun myFunction() {
    println("I just got executed!")
}

fun myFunction(firstName: String) {
    println("First Name: $firstName")
}

fun myFunction(firstName: String, age: Int) {
    println("First Name: $firstName | Age: $age")
}

fun myFunction(addToFive: Int): Int {
    return addToFive + 5
}

// short-hand syntax
fun myFunction(x: Int, y: Int) = x + y


