fun isPalindrome(n: Int): Boolean {
    val s = n.toString()
    return s == s.reversed()
}

fun nearestPalindrome(n: Int): Int {
    var smaller = n - 1
    var larger = n + 1

    while (true) {
        if (isPalindrome(smaller)) return smaller
        if (isPalindrome(larger)) return larger
        smaller--
        larger++
    }
}

fun main() {
    val num = 123
    println("Nearest Palindrome: ${nearestPalindrome(num)}")
}