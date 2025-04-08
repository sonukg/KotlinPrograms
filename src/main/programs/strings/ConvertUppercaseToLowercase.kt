package strings

fun convertUppercaseToLowercase(string: String):String {
    return string.lowercase()
}

//using extension function
fun String.convertToLowercase():String{
    return this.lowercase()
}

fun main(){
    var uppercase="SONU KUMAR"
    var result= convertUppercaseToLowercase(uppercase)
    println(result)

    var result1=uppercase.convertToLowercase()
    println(result1)
}