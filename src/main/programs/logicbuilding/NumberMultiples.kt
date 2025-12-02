package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    println("Enter two numbers:")
    print("First number: ")
    val num1 = scanner.nextInt()
    
    print("Second number: ")
    val num2 = scanner.nextInt()
    
    when {
        num1 == 0 || num2 == 0 -> 
            println("Please enter non-zero numbers.")
        num1 % num2 == 0 -> 
            println("$num1 is a multiple of $num2")
        num2 % num1 == 0 -> 
            println("$num2 is a multiple of $num1")
        else -> 
            println("Neither number is a multiple of the other")
    }
}
