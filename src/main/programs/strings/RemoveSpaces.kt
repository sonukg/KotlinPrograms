package strings

fun removeSpace(string: String):String{
    return string.replace(" ","")
}

fun String.removeSpaces():String{
    return this.replace(" ","")
}

fun main(){
    var str="Hello World"
    var result= removeSpace(str)
    println(result)

    println("-----------------")

    var result1=str.removeSpaces()
    println(result1)
}