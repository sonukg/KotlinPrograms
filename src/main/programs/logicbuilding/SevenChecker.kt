package logicbuilding

import java.util.Scanner

fun checkSevenProperties(num: Int): String {
    val isMultipleOf7 = num % 7 == 0
    val endsWith7 = num % 10 == 7 || num % 10 == -7  // Handles negative numbers
    
    return when {
        isMultipleOf7 && endsWith7 -> "$num is both a multiple of 7 and ends with 7."
        isMultipleOf7 -> "$num is a multiple of 7."
        endsWith7 -> "$num ends with 7."
        else -> "$num is neither a multiple of 7 nor does it end with 7."
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter an integer: ")
    
    if (!scanner.hasNextInt()) {
        println("Please enter a valid integer.")
        return
    }
    
    val num = scanner.nextInt()
    println(checkSevenProperties(num))
}
