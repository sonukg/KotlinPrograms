package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter day number (1-7): ")
    val day = if (scanner.hasNextInt()) scanner.nextInt() else {
        println("Invalid input. Please enter an integer between 1 and 7.")
        return
    }

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day number. Please enter 1-7."
    }

    println(dayName)
}
