package generalprograms

fun factorial(n: Int): Long {
    if (n < 0) return -1
    if (n == 0 || n == 1) return 1

    var result: Long = 1
    for (i in 2..n) {
        result *= i
    }
    return result
}

fun factorialRecursive(n: Int): Long {
    return when {
        n < 0 -> -1
        n == 0 || n == 1 -> 1
        else -> n * factorialRecursive(n - 1)
    }
}

fun factorialFunctional(n: Int): Long {
    return when {
        n < 0 -> -1
        n == 0 || n == 1 -> 1
        else -> (2..n).reduce { acc, i -> acc * i }.toLong()
    }
}

fun main() {
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull() ?: 0
    val result = factorialFunctional(num)
    if (result == -1L) {
        println("Please enter a non-negative number")
    } else {
        println("Factorial of $num is: $result")
    }
}