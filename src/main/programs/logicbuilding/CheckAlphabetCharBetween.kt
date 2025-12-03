package logicbuilding

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a single alphabet character: ")
    val input = scanner.next()

    if (input.length != 1 || !input[0].isLetter()) {
        println("Please enter a single alphabet character.")
        return
    }

    val char = input[0].lowercaseChar()

    when (char) {
        in 'a'..'m' -> println("'${char.uppercaseChar()}' is between A and M")
        in 'n'..'z' -> println("'${char.uppercaseChar()}' is between N and Z")
        else -> println("Please enter a valid alphabet character (a-z or A-Z)")
    }
}