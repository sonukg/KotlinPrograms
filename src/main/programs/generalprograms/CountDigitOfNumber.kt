package generalprograms

fun countDigitOfNumber(num:Int):Int{
    var n=num
    var count=0
    while (n!==0){
        n /=10
        count++
    }
    return count
}

fun main(){
    var num=12345111
    var result= countDigitOfNumber(num)
    println(result)
}