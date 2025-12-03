package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    print("Enter first number: ")
    val num1 = scanner.nextInt()
    
    print("Enter second number: ")
    val num2 = scanner.nextInt()
    
    val isNum1Even = num1 % 2 == 0
    val isNum2Even = num2 % 2 == 0
    
    val result = when {
        isNum1Even && isNum2Even -> "Both numbers are even"
        !isNum1Even && !isNum2Even -> "Both numbers are odd"
        else -> "One number is even and one is odd"
    }
    
    println(result)
}
