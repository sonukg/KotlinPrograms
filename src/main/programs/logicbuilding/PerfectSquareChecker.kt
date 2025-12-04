package logicbuilding

import java.util.Scanner

fun isPerfectSquare(num: Int): Boolean {
    if (num < 0) return false
    if (num <= 1) return true  // 0 and 1 are perfect squares
    
    var left = 1
    var right = num / 2
    
    while (left <= right) {
        val mid = left + (right - left) / 2
        val square = mid.toLong() * mid  // Use Long to prevent overflow
        
        when {
            square == num.toLong() -> return true
            square < num -> left = mid + 1
            else -> right = mid - 1
        }
    }
    
    return false
}

fun main() {
    val scanner = Scanner(System.`in`)
    
    print("Enter a number to check if it's a perfect square: ")
    
    if (!scanner.hasNextInt()) {
        println("Please enter a valid integer.")
        return
    }
    
    val number = scanner.nextInt()
    
    if (isPerfectSquare(number)) {
        // Find the square root by linear search since we know it's a perfect square
        var i = 0
        while (i * i < number) i++
        println("$number is a perfect square of $i (${i}² = ${i * i})")
    } else {
        println("$number is not a perfect square.")
    }
}
