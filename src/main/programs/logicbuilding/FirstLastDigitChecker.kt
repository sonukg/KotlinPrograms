package logicbuilding

import java.util.Scanner

fun checkFirstLastDigits(num: Int): String {
    val firstDigit = num / 1000          // Extract first digit
    val lastDigit = num % 10            // Extract last digit
    
    return if (firstDigit == lastDigit) {
        "First digit ($firstDigit) and last digit ($lastDigit) are equal."
    } else {
        "First digit ($firstDigit) and last digit ($lastDigit) are not equal."
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a 4-digit number: ")
    val num = scanner.nextInt()

    if (num !in 1000..9999) {
        println("Please enter a valid 4-digit number.")
        return
    }

    println(checkFirstLastDigits(num))
}
