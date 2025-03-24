package array

fun main(){
    var array= intArrayOf(2,3,48,89,10)
    var minEl= minimumElement(array)
    println(minEl)
}

fun minimumElement(array: IntArray):Int{
    var minEl=Int.MAX_VALUE
    for (i in array.indices){
        if (array[i]<minEl){
            minEl=array[i]
        }
    }
    return minEl
}