package array

fun findNumberOfOccurenceOfElementInArray(array: IntArray,target:Int):Int{

    var count=0
    for (i in array.indices){
        if (array[i]==target){
            count++
        }
    }
    return count
}
fun main(){
    var array= intArrayOf(2,3,4,2,3,6,3,4,5,6,7,8,9)
    var target=5
    var occurence= findNumberOfOccurenceOfElementInArray(array,target)
    println("$target is occured ${occurence} times")
}