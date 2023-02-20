package basic

// 1. if - statement
// 2. if-else statement
// 3. if-else-if-else statement
// 4. ternary statement
// 5. elvis operator
// 5.1 if-not-null statement
// 5.2. if-not-null-else statement
// 6. when statement

fun main() {
    if (10 > 1) {
        println("10 is greater than 1")
    }

    if (1 > 10) {
        println("10 is less than 1")
    } else {
        println("10 is greater than 1")
    }

    val a: Int = 10;
    val b: Int = 20;
    val c: Int = 5;

    if (a > b) {
        println("$a is greater than $b")
    } else if (b > c) {
        println("$b is greater than $c & $a")
    } else {
        println("$c is the greatest")
    }

    // In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):
    val time: Int = 20
    val greetings: String = if (time < 10) {
        "Good Morning"
    } else if (time < 20) {
        "Good Afternoon"
    } else {
        "Good Evening"
    }

    println(greetings)

    val greetingForToday: String = if (time < 30) "Good Morning" else "Good Evening"
    println(greetingForToday)

    val firstName: String = "Dhruv"
    val lastName: String? = null
    val fullName = firstName + " " + (lastName?: "")
    println(fullName)

    print("Enter Percentage : ")
    val grade = when(Integer.valueOf(readLine())){
        in 90..100 -> 'A'
        in 80..90 -> 'B'
        in 70..80 -> 'C'
        in 60..70 -> 'D'
        else -> 'E'
    }
    println("Grade : $grade")
}