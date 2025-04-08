package strings

fun countWordsInString(str:String):Int {
    return str.trim().split("\\s+".toRegex()).size
}

fun String.countWords(): Int {
    return trim().split("\\s+".toRegex()).size
}

// Count non-empty words
fun String.nonEmptyWordCount(): Int {
    return trim().split("\\s+".toRegex())
        .filter { it.isNotEmpty() }
        .size
}

// Count unique words
fun String.uniqueWordCount(): Int {
    return trim().split("\\s+".toRegex())
        .filter { it.isNotEmpty() }
        .distinct()
        .size
}

// Count words with minimum length
fun String.wordCountWithMinLength(minLength: Int): Int {
    return trim().split("\\s+".toRegex())
        .filter { it.length >= minLength }
        .size
}

fun main(){
    var str="sonu kumar gupta"
    val text = "The quick brown fox jumps over the lazy dog"
    var result= countWordsInString(str)
    println(result)
    println("-------------")
    var result1= str.countWords()
    println(result1)
    println("Word count: ${text.nonEmptyWordCount()}")
    println("Unique word count: ${text.uniqueWordCount()}")
    println("Words with min length 6: ${text.wordCountWithMinLength(5)}")
}