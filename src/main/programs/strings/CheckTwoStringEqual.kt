package strings

fun isStringEqual(str:String,str1:String):Boolean{
    return str.equals(str1)
}

fun String.isStringEquals(other:String):Boolean{
    return this==other
}

// Basic equals
fun String.isStringEqua(other: String): Boolean = this == other

// Ignore case
fun String.isStringEqualsIgnoreCase(other: String): Boolean =
    this.equals(other, ignoreCase = true)

// Compare with trim
fun String.isStringEqualsTrimmed(other: String): Boolean =
    this.trim() == other.trim()

// Compare content only (ignoring case and whitespace)
fun String.isContentEquals(other: String): Boolean =
    this.trim().equals(other.trim(), ignoreCase = true)

// Compare multiple strings
fun String.isEqualToAny(vararg others: String): Boolean =
    others.any { this == it }

fun main(){
    var str="sonu kumar"
    var str1="sonu kumar"
    var result= isStringEqual(str, str1)
    println(result)
    println("---------------")
    var result1= str.isStringEquals(str1)
    println(result1)

    // Basic comparison
    println(str.isStringEquals(str1))  // true

    // Ignore case comparison
    println(str.isStringEqualsIgnoreCase(str1))  // true

    // Trimmed comparison
    println(str.isStringEqualsTrimmed(str1))  // true

    // Content comparison
    println(str.isContentEquals(str1))  // true

    // Multiple string comparison
    println(str.isEqualToAny("sonu kumar"))
}