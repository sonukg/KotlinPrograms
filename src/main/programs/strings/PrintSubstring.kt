package strings

fun getSubstringLoop(input: String, start: Int, end: Int): String {
    var result = ""
    for (i in start until end) {
        if (i < input.length) {
            result += input[i]
        }
    }
    return result
}

fun String.getSubstringExt(start: Int, end: Int): String {
    var result = ""
    for (i in start until minOf(end, this.length)) {
        result += this[i]
    }
    return result
}

fun getSubstringFunctional(input: String, start: Int, end: Int): String =
    input.filterIndexed { index, _ -> index in start until end }


fun getSubstringBuilder(input: String, start: Int, end: Int): String {
    val builder = StringBuilder()
    for (i in start until minOf(end, input.length)) {
        builder.append(input[i])
    }
    return builder.toString()
}

fun getSubstringSlice(input: String, start: Int, end: Int): String =
    input.slice(start until end)

fun main(){
    val testString = "Hello World"
    println("\nGetting substring from index 2 to 7 of '$testString':")
    println("Using Loop: ${getSubstringLoop(testString, 2, 7)}")
    println("Using Extension: ${testString.getSubstringExt(2, 7)}")
    println("Using Functional: ${getSubstringFunctional(testString, 2, 7)}")
    println("Using StringBuilder: ${getSubstringBuilder(testString, 2, 7)}")
    println("Using Slice: ${getSubstringSlice(testString, 2, 7)}")
}