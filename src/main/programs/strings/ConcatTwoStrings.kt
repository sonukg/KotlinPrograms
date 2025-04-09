package strings

fun concatTwoStrings(str1:String,str2:String):String{
    var concatString=str1+str2
    return concatString
}

fun concatTwoStringsTwo(str1:String,str2:String):String{
    var concatString="${str1} ${str2}"
    return concatString
}

fun String.concateString(str:String):String{
    return this.plus(str)
}

fun main(){
    var str1="Sonu"
    var str2="Kumar"
    println(concatTwoStrings(str1, str2))
    println("-------------")
    println(concatTwoStringsTwo(str1, str2))
    println("-------------")
    println(str1.concateString(str2))
}