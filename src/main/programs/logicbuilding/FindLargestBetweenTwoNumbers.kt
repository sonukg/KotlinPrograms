package logicbuilding

fun main() {
    val num1=10
    val num2=20
    println(largestBetweenTwoNumbers(num1,num2))
}

fun largestBetweenTwoNumbers(num1:Int,num2:Int):Int{
    if (num1>num2){
        return num1
    }else{
        return num2
    }
}