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

    if (isValidTriangles(side1, side2, side3)) {
        println("These sides can form a valid triangle.")
        when {
            side1 == side2 && side2 == side3 -> println("It is an equilateral triangle.")
            side1 == side2 || side1 == side3 || side2 == side3 -> println("It is an isosceles triangle.")
            else -> println("It is a scalene triangle.")
        }
    } else {
        println("These sides cannot form a valid triangle.")
    }
}

fun isValidTriangles(a: Double, b: Double, c: Double): Boolean {
    return a + b > c && a + c > b && b + c > a
}