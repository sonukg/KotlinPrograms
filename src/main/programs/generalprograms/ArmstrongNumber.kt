package generalprograms
fun isArmstrongNumber(num:Int):Boolean{
    var n=num
    var sum=0
    var digits=num.toString().length
    while (n!=0){
        val digit= n %10
        sum += Math.pow(digit.toDouble(),digits.toDouble()).toInt()
        n /=10
    }
    return num==sum
}

fun main(){
var num=153
    println(isArmstrongNumber(num))
}