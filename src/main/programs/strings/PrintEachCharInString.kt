package strings

fun printEachCharInString(str:String){
    for (char in str){
      println(char)
    }
}


// Extension function using forEach
fun String.printEachChar() {
    forEach { char ->
        println(char)
    }
}

// With index
fun String.printEachCharWithIndex() {
    forEachIndexed { index, char ->
        println("Index $index: $char")
    }
}

// Print vertically
fun String.printVertically() {
    forEach { println(it) }
}

// Print horizontally with separator
fun String.printHorizontally(separator: String = " ") {
    println(toCharArray().joinToString(separator))
}

// Print with position information
fun String.printWithPosition() {
    forEachIndexed { index, char ->
        println("Position ${index + 1}: $char")
    }
}

// Print with ASCII value
fun String.printWithAscii() {
    forEach { char ->
        println("'$char' (ASCII: ${char.code})")
    }
}

// Print with character type
fun String.printWithType() {
    forEach { char ->
        val type = when {
            char.isLetter() -> "letter"
            char.isDigit() -> "digit"
            char.isWhitespace() -> "whitespace"
            else -> "special character"
        }
        println("'$char' is a $type")
    }
}

fun main(){
    var str="Sonu Kumar"
    printEachCharInString(str)
    println(str.printEachChar())
    println(str.printEachCharWithIndex())

    println("Vertical printing:")
    str.printVertically()

    println("\nHorizontal printing:")
    str.printHorizontally(" | ")

    println("\nWith position:")
    str.printWithPosition()

    println("\nWith ASCII values:")
    str.printWithAscii()

    println("\nWith character types:")
    str.printWithType()
}