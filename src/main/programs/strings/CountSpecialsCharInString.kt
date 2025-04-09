package strings

fun countSpecialCharInString(str:String):Int{
    val SPECIAL_CHARS = "!@#$%^&*()_+-=[]{}|;:'\",.<>?/~`"
    var count=0
    for (char in str){
        if (SPECIAL_CHARS.contains(char)) count++
    }
    return count
}

fun String.countSpecialCharacter():Int{
    var count=0
    for (char in this){
        if (!char.isLetterOrDigit() && !char.isWhitespace()) count++
    }
    return count
}

fun countSpecialCharsRegex(input: String): Int {
    return input.count { it.toString().matches(Regex("[^A-Za-z0-9\\s]")) }
}

fun countSpecialCharsRegexPattern(input: String): Int {
    return Regex("[^A-Za-z0-9\\s]").findAll(input).count()
}


fun String.countSpecialCharsFunctional(): Int =
    this.filter { !it.isLetterOrDigit() && !it.isWhitespace() }.length


fun String.countSpecialCharsFunctional2(): Int =
    count { !it.isLetterOrDigit() && !it.isWhitespace() }

fun main(){
    val testStrings = listOf(
        "Hello, World!",
        "Test@123#",
        "No special chars",
        "!@#$%^&*()",
        "Mix3d Ch@r$ & Symb0l$"
    )

    println("Testing different strings:")
    testStrings.forEach { str ->
        println("\nString: '$str'")
        println("1. For Loop: ${countSpecialCharInString(str)}")
        println("2. Extension: ${str.countSpecialCharacter()}")
        println("3. Regex: ${countSpecialCharsRegex(str)}")
        println("4. Functional: ${str.countSpecialCharsFunctional()}")
        println("5. Functional2: ${str.countSpecialCharsFunctional2()}")
    }


    val specialTest = "!@#$%^&*()_+-="
    println("\nTesting string with only special characters: '$specialTest'")
    println("Count: ${specialTest.countSpecialCharacter()}")
}