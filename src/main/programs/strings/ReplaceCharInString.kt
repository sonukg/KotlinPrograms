package strings

fun replaceCharInString(string: String,oldStr:String,newStr:String):String{
    return string.replace(oldStr,newStr)
}

// Extension function version
fun String.replaceChar(oldChar: Char, newChar: Char): String {
    return this.replace(oldChar, newChar)
}

// Multiple replacements
fun String.replaceMultipleChars(vararg replacements: Pair<Char, Char>): String {
    var result = this
    replacements.forEach { (old, new) ->
        result = result.replace(old, new)
    }
    return result
}

// Replace single character
fun String.replaceCharSingle(old: Char, new: Char): String =
    replace(old, new)

// Replace first occurrence only
fun String.replaceFirstChar(old: Char, new: Char): String =
    replaceFirst(old.toString(), new.toString())

// Replace with case-insensitive
fun String.replaceCharIgnoreCase(old: Char, new: Char): String =
    replace(old.toString(), new.toString(), ignoreCase = true)

// Replace multiple characters with same replacement
fun String.replaceChars(chars: Set<Char>, replacement: Char): String {
    var result = this
    chars.forEach { char ->
        result = result.replace(char, replacement)
    }
    return result
}

// Replace using regex
fun String.replacePattern(pattern: String, replacement: String): String =
    replace(Regex(pattern), replacement)

fun main(){
    val text = "Hello World"


    println(replaceCharInString(text, 'o'.toString(), 'x'.toString()))

    println(text.replaceChar('l', 'z'))

    println(text.replaceMultipleChars(
        'l' to '1',
        'o' to '0'
    ))

    // Basic replacement
    println(text.replaceCharSingle('l', '1'))

    // Replace first occurrence only
    println(text.replaceFirstChar('l', '1'))

    // Case insensitive replacement
    println(text.replaceCharIgnoreCase('h', 'j'))

    // Replace multiple characters
    println(text.replaceChars(setOf('l', 'o'), '*'))

    // Replace using pattern
    println(text.replacePattern("[aeiou]", "*"))
}