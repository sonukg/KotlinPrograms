package generalprograms

fun checkOddEven(num:Int){
    if (num % 2==0){
        println("$num is Even Number")
    }else{
        println("$num is Odd Number")
    }
}

fun main(){
var num=12
    var result= checkOddEven(num)
}