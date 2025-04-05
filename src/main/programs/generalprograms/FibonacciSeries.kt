package generalprograms

fun fibonacciSeries(n:Int){
    var a=0
    var b=1
    for (i in 0 until n){
        print(" $a")
        var next=a+b
        a=b
        b=next
    }
}

fun fibonacciArray(n:Int):List<Int>{
    val series= mutableListOf<Int>()
    when{
        n<=0 -> return series
        n==1 -> return listOf(0)
        n==2 -> return listOf(0,1)

    }
    series.add(0)
    series.add(1)


    for (i in 2 until n){
        series.add(series[i-1]+series[i-2])
    }
    return series
}

fun fibonacciRecursive(n: Int): Int {
    return when {
        n <= 0 -> 0
        n == 1 -> 1
        else -> fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }
}

fun fibonacciSequence() = sequence {
    var terms = Pair(0, 1)

    // yield first number
    yield(terms.first)

    while (true) {
        // yield second number
        yield(terms.second)

        // compute next term
        terms = Pair(terms.second, terms.first + terms.second)
    }
}

fun main(){
    //fibonacciSeries(8)
    println("Enter number of series: ")
    val t= readLine()?.toIntOrNull() ?:0
    val result= fibonacciArray(t)
    println("Fibonacci Series: $result")

    print("Fibonacci Series recursive: ")
    for (i in 0 until t) {
        println("${fibonacciRecursive(i)} ")
    }

    println("Fibonacci Series: ")
    fibonacciSequence()
        .take(t)
        .forEach { print("$it ") }
}