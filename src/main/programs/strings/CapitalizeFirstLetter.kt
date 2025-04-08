package strings

fun capitalizeFirstLetters(str:String):String{
    return str.replaceFirstChar { it.uppercase() }
}

fun String.capitalizeFirstLetter():String{
    return this.replaceFirstChar { it.uppercase() }
}

fun capitalizeFirstLetterOne(str: String): String {
    return str.split(" ")
        .map { it.replaceFirstChar { char -> char.uppercase() } }
        .joinToString(" ")
}

// Using extension function
fun String.capitalizeFirstLetterss(): String {
    return this.split(" ")
        .map { it.replaceFirstChar { char -> char.uppercase() } }
        .joinToString(" ")
}


fun main(){
    var str="sonu kumar"
    var result= capitalizeFirstLetters(str)
    println(result)
    println("--------------")
    var result1= str.capitalizeFirstLetter()
    println(result1)
    println("--------------")
    var result2= capitalizeFirstLetterOne(str)
    println(result2)
    println("--------------")
    var result3= str.capitalizeFirstLetterss()
    println(result3)
}