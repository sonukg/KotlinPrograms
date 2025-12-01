package logicbuilding

fun checkVowelOrConsonant(char: Char): String {
    return when (char.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> "Vowel"
        in 'a'..'z' -> "Consonant"
        else -> "Not a valid letter"
    }
}

fun main() {
    val testChars = listOf('a', 'B', 'e', 'Z', '1', '*', 'i', 'O')
    
    for (char in testChars) {
        println("'$char' is a ${checkVowelOrConsonant(char)}")
    }
}
