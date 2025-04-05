package array

fun maxSubArray(array: IntArray):Int{
    var maxSum=Int.MIN_VALUE
    for (i in array.indices){
        var currentSum=0
        for (j in i until array.size){
            currentSum  +=array[j]
            maxSum = maxOf(maxSum,currentSum)
        }
    }

    return maxSum
}

fun main(){
    var array= intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    var result= maxSubArray(array)
    println(result)
}