package strings

fun countDigitInString(str:String):Int{
    var count=0
    for (char in str){
        if (char.isDigit()){
            count++
        }
    }
    return count
}

fun String.countDigit():Int{
    var count=0
    for (char in this){
        if (char.isDigit()) count++
    }
    return count
}

fun String.countDigitShort():Int=count{it.isDigit()}

fun countDigitsRegex(input: String): Int {
    return input.count { it.toString().matches(Regex("[0-9]")) }
}

fun countDigitsRegexPattern(input: String): Int {
    return Regex("\\d").findAll(input).count()
}

fun main() {
    val testString = "Hello123World456!"


    println("For Loop: ${countDigitInString(testString)}")  // Output: 6


    println("Extension: ${testString.countDigit()}")  // Output: 6
    println("Short Extension: ${testString.countDigitShort()}")  // Output: 6


    println("Regex: ${countDigitsRegex(testString)}")  // Output: 6
    println("Regex Pattern: ${countDigitsRegexPattern(testString)}")  // Output: 6


    val samples = listOf(
        "No digits here!",
        "12345",
        "Mix3d Numb3rs 123",
        ""
    )

    println("\nTesting different strings:")
    samples.forEach { str ->
        println("'$str' contains ${str.countDigit()} digits")
    }
}