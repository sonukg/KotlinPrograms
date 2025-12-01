package generalprograms

fun main() {
    var num = 12345

    println(reverseNumber(num))
    println(reverseNumber1(num))
}

//write program of reverse the number Using while loop
fun reverseNumber(num: Int): Int {
    var num1=num
    var rev = 0
    while (num1 != 0) {
        var rem = num1 % 10
        rev = rev * 10 + rem
        num1 /= 10
    }
    return rev
}

//write program of reverse the number Using for loop
fun reverseNumber1(num: Int): Int{
    var n=num
    var rev=0
    val digits=num.toString().length
    for ( i in 1..digits){
        val rem= n%10
        rev=rev*10+rem
        n/=10
       // if (n==0) break
    }
    return rev
}

