package strings

fun convertLowercaseToUppercase(str:String):String{
    return str.uppercase()
}

fun String.convertToUppercase():String{
    return uppercase()
}

fun main(){
    var str="Hello WOrLd"
    var result= convertLowercaseToUppercase(str)
    println(result)

    var result1=str.convertToUppercase()
    println(result1)
}