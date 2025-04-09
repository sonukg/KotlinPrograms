package strings

fun String.removeAllDigit(): String {
    return this.filterNot { it.isDigit() }
}

fun String.removeAllDigitsRegex(): String {
    return this.replace(Regex("\\d"), "")
}

fun removeAllDigits(input: String): String {
    val result = StringBuilder()

    for (char in input) {
        if (!char.isDigit()) {
            result.append(char)
        }
    }

    return result.toString()
}

//using MutableList
fun removeAllDigitsList(input: String): String {
    val result = mutableListOf<Char>()

    for (char in input) {
        if (!char.isDigit()) {
            result.add(char)
        }
    }

    return result.joinToString("")
}

// using traditional for loop index
fun removeAllDigitsIndex(input: String): String {
    val result = StringBuilder()

    for (i in input.indices) {
        if (!input[i].isDigit()) {
            result.append(input[i])
        }
    }

    return result.toString()
}

fun String.removeAllDigitss(): String {
    val result = StringBuilder()

    for (char in this) {
        if (!char.isDigit()) {
            result.append(char)
        }
    }

    return result.toString()
}

// Alternative using mutable list
fun String.removeAllDigitsLists(): String {
    val result = mutableListOf<Char>()

    for (char in this) {
        if (!char.isDigit()) {
            result.add(char)
        }
    }

    return result.joinToString("")
}

fun main(){
    val text1 = "Hello123World456!"
    println(text1.removeAllDigit())
    println(removeAllDigits(text1))

    val text2 = "2FA Code: 123456"
    println(text2.removeAllDigit())
    println(removeAllDigitsList(text2))

    val text3 = "Phone: 555-123-4567"
    println(text3.removeAllDigitsRegex())
    println(removeAllDigitsIndex(text3))
}