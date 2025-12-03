package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    print("Please enter your age: ")
    val age = scanner.nextInt()
    
    if (age >= 18) {
        println("You are eligible to vote!")
    } else {
        val yearsLeft = 18 - age
        println("You are not eligible to vote yet. Come back in $yearsLeft year${if (yearsLeft > 1) "s" else ""}!")
    }
}
