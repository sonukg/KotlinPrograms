package strings

fun countVowelsAndConstants(string: String){
    var clnStr=string.lowercase().filter { it.isLetter() }
    val vowels=clnStr.count { it in "aeiou" }
    val const=clnStr.count{it.isLetter() && it !in "aeiou"}
    println("Input String: $string")
    println("Vowels: $vowels")
    println("Constants: $const")


}

fun countVowelsAndConsonants(str: String) {
    var vowels = 0
    var consonants = 0

    val text = str.lowercase()

    for (char in text) {
        when {
            char in "aeiou" -> vowels++
            char.isLetter() -> consonants++
        }
    }

    println("Input String: $str")
    println("Number of vowels: $vowels")
    println("Number of consonants: $consonants")
}

fun main(){
    val testStrings = listOf(
        "Hello World!",
        "OpenAI",
        "12345",
        "aEiOu",
        ""
    )
    countVowelsAndConstants(testStrings.toString())
    countVowelsAndConsonants(testStrings.toString())
}