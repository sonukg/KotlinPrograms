//An extension function allows you to add new functionality to an existing class without
// modifying its source code.

//It is defined outside the class but can be called as if it were a member of the class.

fun String.isPalindrome():Boolean{
    return this==this.reversed()
}

fun Int.isEven():Boolean{
    return this % 2==0
}
fun Int.isOdd():Boolean{
    return this % 2!==0
}
fun main(){
    val word="madam"
    val number=10
    println(word.isPalindrome())
    println(number.isEven())
    println(number.isOdd())
}