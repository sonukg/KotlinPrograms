package generalprograms

fun main() {
    //find palindrome using reversed function
    val str = "121"
    val reversedStr = str.reversed()
    if (str == reversedStr) {
        println("$str is a palindrome")
    } else {
        println("$str is not a palindrome")
    }

    val num=121
    println("Palindrome Number:"+ isPalindromeNumber(num))
}

fun isPalindromeNumber(n:Int): Boolean {
    var num = n
    var reversedNum = 0
    while (num != 0) {
        val digit = num % 10
        reversedNum = reversedNum * 10 + digit
        num /= 10
    }
    return n == reversedNum
}

