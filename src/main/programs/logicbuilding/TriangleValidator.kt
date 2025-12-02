package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter three sides of a triangle:")
    print("Side 1: ")
    val side1 = scanner.nextDouble()

    print("Side 2: ")
    val side2 = scanner.nextDouble()

    print("Side 3: ")
    val side3 = scanner.nextDouble()

    if (isValidTriangle(side1, side2, side3)) {
        println("These sides can form a valid triangle.")
    } else {
        println("These sides cannot form a valid triangle.")
    }
}

fun isValidTriangle(a: Double, b: Double, c: Double): Boolean {
    return a + b > c && a + c > b && b + c > a
}



