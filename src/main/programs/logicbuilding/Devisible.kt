package logicbuilding

fun Devisible(){
    val num=5
    val rem=num%2
    if (rem==0)
        println("$num is divisible by 2")
    else
        println("$num is not divisible by 2")
}

fun main(){
    Devisible()
}