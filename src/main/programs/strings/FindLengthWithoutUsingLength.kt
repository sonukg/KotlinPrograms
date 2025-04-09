package strings

fun findLengthWithoutLength(str:String):Int{
    var count=0
    for (char in str.indices){
        count++
    }
    return count
}

fun String.findLength():Int{
    return this.count()
}
fun main(){
    var str="SonuKumar"
    println(findLengthWithoutLength(str))
    println(str.findLength())
}