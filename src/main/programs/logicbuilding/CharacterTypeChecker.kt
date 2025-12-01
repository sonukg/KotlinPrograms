package logicbuilding

fun checkCharacterType(char: Char): String {
    return when {
        char.isUpperCase() -> "Uppercase letter"
        char.isLowerCase() -> "Lowercase letter"
        char.isDigit() -> "Digit"
        else -> "Special character"
    }
}

fun main() {
    val testChars = listOf('A', 'b', '1', '@', 'Z', 'x', '5', '!', '?')
    
    for (char in testChars) {
        println("'$char' is a ${checkCharacterType(char)}")
    }
}
