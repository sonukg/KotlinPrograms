package array

fun thirdMinimumElement(array: IntArray):Int {
    var min=Int.MAX_VALUE
    var sMin=Int.MAX_VALUE
    var tMin=Int.MAX_VALUE

    for (i in array.indices){
        if (array[i]<min){
            tMin=sMin
            sMin=min
            min=array[i]
        }else if (array[i]<sMin && array[i]>min){
            tMin=sMin
            sMin=array[i]
        }else if (array[i]<tMin && array[i]>sMin && array[i]>min){
            tMin=array[i]
        }
    }
    return tMin
}

fun main(){
    val array= intArrayOf(2,3,4,5,10,29,28)
    val tMin= thirdMinimumElement(array)
    println(tMin)
}