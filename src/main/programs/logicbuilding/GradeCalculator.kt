package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    print("Enter marks (0-100): ")
    val marks = scanner.nextInt()
    
    val grade = when {
        marks > 100 -> "Invalid marks! Marks cannot be greater than 100."
        marks >= 90 -> "A+"
        marks >= 80 -> "A"
        marks >= 70 -> "B"
        marks >= 60 -> "C"
        marks >= 40 -> "D"
        marks >= 0 -> "F"
        else -> "Invalid marks! Marks cannot be negative."
    }
    
    println("Grade: $grade")
}
