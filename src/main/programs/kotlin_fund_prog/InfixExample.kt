package kotlin_fund_prog

//infix functions are used for declaring a short form notation of a function.
infix fun Int.printSmallest(x:Int){
    if(this<x) {
        println(this)
    }else{
        println(x)
    }
}

fun main(){
    2 printSmallest 5
}