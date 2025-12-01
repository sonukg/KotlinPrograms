package logicbuilding

fun largestBetweenThreeNumbers(num1:Int,num2:Int,num3:Int):Int{
    if (num1>num2 && num1>num3){
        return num1
    }else if (num2>num1 && num2>num3){
        return num2
    }else{
        return num3
    }
}

fun main(){
    println(largestBetweenThreeNumbers(1,2,3))
}