package strings

fun compareTwoStrWithoutEquals(str1:String,str2:String): Boolean {
    if (str1.length !=str2.length){
        return false
    }

    for (i in str1.indices){
        if (str1[i] != str2[i]){
            return false
        }
    }
    return true
}

fun String.compareTwoStr(str:String):Boolean{
    return this ==str
}

fun main(){
    var str1="Sonu Kumar"
    var str2="Sonu Kumar"
    println(compareTwoStrWithoutEquals(str1, str2))
    println("-----------------------")
    println(str1.compareTwoStr(str2))
}