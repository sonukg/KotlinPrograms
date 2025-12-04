package logicbuilding

import java.util.Scanner

fun checkMiddleDigit(num: Int): String {
    val d1 = num / 100        // Extract first digit
    val d2 = (num / 10) % 10  // Extract middle digit
    val d3 = num % 10         // Extract last digit
    
    return when {
        d2 > d1 && d2 > d3 -> "The middle digit $d2 is the largest digit."
        d2 < d1 && d2 < d3 -> "The middle digit $d2 is the smallest digit."
        else -> "The middle digit $d2 is neither the largest nor the smallest."
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a 3-digit number: ")
    val num = scanner.nextInt()

    if (num !in 100..999) {
        println("Please enter a valid 3-digit number.")
        return
    }

    println(checkMiddleDigit(num))
}
