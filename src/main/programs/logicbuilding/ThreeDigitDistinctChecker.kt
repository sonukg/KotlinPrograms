package logicbuilding

import java.util.Scanner

fun areAllDigitsDistinct(num: Int): Boolean {
    val d1 = num / 100
    val d2 = (num / 10) % 10
    val d3 = num % 10
    return d1 != d2 && d1 != d3 && d2 != d3
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a 3-digit number: ")
    val num = scanner.nextInt()

    if (num !in 100..999) {
        println("Please enter a valid 3-digit number.")
        return
    }

    if (areAllDigitsDistinct(num)) {
        println("All digits are distinct.")
    } else {
        println("Digits are not distinct.")
    }
}
