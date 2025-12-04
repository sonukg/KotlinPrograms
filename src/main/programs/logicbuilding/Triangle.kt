package logicbuilding


import java.util.Scanner

class Triangle(private val angle1: Double, private val angle2: Double) {
    init {
        require(angle1 > 0 && angle2 > 0) { "Angles must be positive" }
        require(angle1 + angle2 < 180) { "Sum of two angles must be less than 180 degrees" }
    }

    val thirdAngle: Double
        get() = 180 - angle1 - angle2
}

fun readValidDouble(prompt: String): Double {
    val scanner = Scanner(System.`in`)
    while (true) {
        print(prompt)
        try {
            return scanner.nextDouble().also {
                if (it <= 0) throw NumberFormatException("Value must be positive")
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a valid positive number.")
            scanner.nextLine() // Clear the invalid input
        }
    }
}

fun main() {
    println("Triangle Angle Calculator")
    println("-------------------------")

    val angle1 = readValidDouble("Enter first angle (degrees): ")
    val angle2 = readValidDouble("Enter second angle (degrees): ")

    try {
        val triangle = Triangle(angle1, angle2)
        val thirdAngle = triangle.thirdAngle
        println("\nThe third angle is: ${"%.2f".format(thirdAngle)} degrees")

        // Additional information
        when {
            thirdAngle == 90.0 -> println("This is a right-angled triangle.")
            thirdAngle > 90.0 -> println("This is an obtuse-angled triangle.")
            else -> println("This is an acute-angled triangle.")
        }
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
        println("These angles cannot form a valid triangle.")
    }
}