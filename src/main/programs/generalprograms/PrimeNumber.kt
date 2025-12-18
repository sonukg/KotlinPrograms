package generalprograms//ascendion

fun main(){
    val num = 29
    println("$num is Prime Number:${isPrime(num)}")
    println("$num is Prime Number:${isPrimeOne(num)}")
    isPrimeUsingRanges()
}

fun isPrime(num: Int):Boolean {
    if (num < 2){
        return false
    }
    for (i in 2..num /2){
        if (num % i==0){
            return false
        }
    }
    return true
}

fun isPrimeOne(n:Int):Boolean{
    if (n <2 ) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()){
        if (n % i==0){
            return false
        }
    }
    return true
}

fun isPrimeUsingRanges(){
    val start=2
    val end=100
    for (n in start..end){
        if (isPrimeOne(n)){
            println("$n is Prime Number")
        }
    }
}

