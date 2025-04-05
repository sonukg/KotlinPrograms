package generalprograms

fun sumOfFirstNNaturalNumbers(num:Int):Int {

    var sum=0
    for (i in 1..num){
        sum +=i
    }
    return sum
}

fun sumOfFirstNNaturalNumbers1(num:Int):Int {
    return (1..num).sum()
}

fun main(){
    var num=10
    val result= sumOfFirstNNaturalNumbers1(num)
    println(result)
}