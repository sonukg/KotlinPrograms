package strings

fun toggleEachCharCase(string: String):String{
    return string.map { char->
        when{
            char.isUpperCase() -> char.lowercase()
            char.isLowerCase() -> char.uppercase()
            else -> char
        }
    }.joinToString("")

}

fun String.toggleEachChar():String{
    return this.map { char->
        when{
            char.isUpperCase() -> char.lowercase()
            char.isLowerCase() -> char.uppercase()
            else -> char
        }
    }.joinToString("")
}

fun main(){
    val str="Sonu Kumar Gupta"
    println(toggleEachCharCase(str))

    val str1="TeStInG"
    println(str1.toggleEachChar())
}