package basic

// 1. while & do while
// 2. break/continue
// 3. for
// 4. ranges

fun main() {
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    println("--------------")
    i = 0
    do {
        println(i)
        i++
    }
    while (i < 5)

    println("--------------")
    i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }

    println("--------------")
    i = 0
    while (i < 10) {
        if (i == 4) {
            i++
            continue
        }
        println(i)
        i++
    }

    println("--------------")
    val cars: Array<String> = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    val nums: Array<Int> = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    println("--------------")
    for (chars in 'a'..'z') {
        println(chars)
    }
}