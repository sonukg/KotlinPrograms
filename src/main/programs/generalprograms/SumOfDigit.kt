package generalprograms

// write a program to sum of digit of numbers
fun sumOfDigit(num:Int):Int{
    var n=num
    var sum=0
    while (n!=0){
        sum +=n %10
        n /=10
    }
    return sum

}

fun main(){
    var num=12345
    var result= sumOfDigit(num)
    println(result)
}
