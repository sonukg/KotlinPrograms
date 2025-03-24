package array

fun secondMinimumElement(array: IntArray):Int{
    var min=Int.MAX_VALUE
    var sMin=Int.MAX_VALUE

    for (i in array.indices){
        if (array[i]<min){
            sMin=min
            min=array[i]
        }else if (array[i]<sMin && array[i]>min){
            sMin=array[i]
        }
    }
    return sMin
}

fun main(){
    val array= intArrayOf(2,3,4,5,10,29,28)
    val sMin= secondMinimumElement(array)
    println(sMin)
}