package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter month number (1-12): ")
    val month = if (scanner.hasNextInt()) scanner.nextInt() else {
        println("Invalid input. Please enter an integer between 1 and 12.")
        return
    }

    val days = when (month) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> 28
        else -> null
    }

    if (days == null) {
        println("Invalid month number. Please enter 1-12.")
    } else {
        println(days)
    }
}
