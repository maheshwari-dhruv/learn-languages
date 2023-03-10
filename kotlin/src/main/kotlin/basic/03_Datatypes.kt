package basic

fun main() {
    // data types in kotlin
    /**
     * Data types are divided into different groups:
     * Numbers
     * Characters
     * Booleans
     * Strings
     * Arrays
     *
     * Numbers -
     * 1. Integer Type - Byte, Short, Int & Long
     * 2. Floating Type - Float & Double
     */
    val myNum: Int = 5             // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'        // Char
    val myBoolean: Boolean = true      // Boolean
    val myText: String = "Hello"      // String

    println("Int: $myNum | Double: $myDoubleNum | Character: $myLetter | Boolean: $myBoolean | String: $myText")

    // Type conversion
    val x: Int = 10
    val y: Long = x.toLong()
    println("x: $x | y: $y")
}