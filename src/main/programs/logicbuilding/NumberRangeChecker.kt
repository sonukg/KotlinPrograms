package logicbuilding

import java.util.Scanner

fun isInRange100To999(number: Int): Boolean {
    return number in 100..999
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a number: ")
    
    if (!scanner.hasNextInt()) {
        println("Please enter a valid integer.")
        return
    }
    
    val number = scanner.nextInt()
    
    if (isInRange100To999(number)) {
        println("$number is within the range [100, 999]")
    } else {
        println("$number is not within the range [100, 999]")
    }
}
