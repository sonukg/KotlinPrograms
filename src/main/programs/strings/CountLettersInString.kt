package strings

fun countLettersInString(str:String):Int{
    var count=0
    for (char in str){
        if (char.isLetter()){
            count++
        }
    }
    return count
}

fun String.countLetters():Int{
    var count=0
    for (char in this){
        if (char.isLetter()) count++
    }
    return count
}

fun String.countLettersShort():Int=count{it.isLetter()}

fun countLettersRegex(input: String): Int {
    return input.count { it.toString().matches(Regex("[a-z,A-Z]")) }
}



fun main() {
    val testString = "Hello123World456!"


    println("For Loop: ${countLettersInString(testString)}")


    println("Extension: ${testString.countLetters()}")
    println("Short Extension: ${testString.countLettersShort()}")


    println("Regex: ${countLettersRegex(testString)}")

    val samples = listOf(
        "No digits here!",
        "12345",
        "Mix3d Numb3rs 123",
        ""
    )

    println("\nTesting different strings:")
    samples.forEach { str ->
        println("'$str' contains ${str.countLetters()} letters")
    }
}