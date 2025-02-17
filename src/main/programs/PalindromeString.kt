
fun isPalindromeString(str: String): Boolean {
    val cleanStr = str.lowercase()  // Convert to lowercase for case-insensitivity
    val length = cleanStr.length

    for (i in 0 until length / 2) {
        if (cleanStr[i] != cleanStr[length - i - 1]) {
            return false  // Mismatch found, not a palindrome
        }
    }
    return true
}


//find palindrome string with reversed string
fun isPalindromeString2(str: String): Boolean {
    val cleanStr = str.lowercase()  // Convert to lowercase for case-insensitivity
    val reversedStr = cleanStr.reversed()
    return cleanStr == reversedStr
}

fun main() {
    val word = "Madam"
    println("\"$word\" is Palindrome: ${isPalindromeString(word)}")
    println("\"$word\" is Palindrome: ${isPalindromeString2(word)}")
}


