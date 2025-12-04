package logicbuilding


import java.util.Scanner

fun determineQuadrant(x: Double, y: Double): String {
    return when {
        x > 0 && y > 0 -> "Quadrant I"
        x < 0 && y > 0 -> "Quadrant II"
        x < 0 && y < 0 -> "Quadrant III"
        x > 0 && y < 0 -> "Quadrant IV"
        x == 0.0 && y != 0.0 -> "Y-axis"
        y == 0.0 && x != 0.0 -> "X-axis"
        else -> "Origin"
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter x-coordinate: ")
    val x = scanner.nextDouble()

    print("Enter y-coordinate: ")
    val y = scanner.nextDouble()

    val result = determineQuadrant(x, y)
    println("Point ($x, $y) is in $result")
}