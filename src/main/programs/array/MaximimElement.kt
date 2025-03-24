package array

fun main(){
    var arr= intArrayOf(2,9,8,7,37,39)
    var max= maximumElement(arr)
    println(max)
}

fun maximumElement(arr:IntArray):Int{
    //find the maximum element in array
    var max=Int.MIN_VALUE

    for (i in arr.indices){
        if (arr[i] > max) {
            max=arr[i]
        }
    }
    return max
}