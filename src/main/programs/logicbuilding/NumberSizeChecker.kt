package logicbuilding

import java.util.Scanner

fun checkNumberSize(num: Int): String {
    return when (num) {
        in -9..9 -> "$num is a single-digit number."
        in -99..-10, in 10..99 -> "$num is a double-digit number."
        else -> "$num is a multi-digit number (3 or more digits)."
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
    println(checkNumberSize(num))
}
