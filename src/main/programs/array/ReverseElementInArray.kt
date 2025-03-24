package array

fun reverseElementInArray(){
    val arr= intArrayOf(1,2,3,4,5,6,7,8)
    for(i in 0 until arr.size/2){
        var temp=arr[i]
        arr[i]=arr[arr.lastIndex-i]
        arr[arr.lastIndex-i]=temp
    }
    println(arr.toList())
}

fun reverseElementInArrayUsingWhile(){
    var array= intArrayOf(1,2,3,4,5,6,7,81)
    var start=0
    var end=array.size-1
    while (start<end){
        var temp=array[start]
        array[start]=array[end]
        array[end]=temp
        start++
        end--
    }
    println(array.toList())
}

fun main(){
    reverseElementInArray()
    println("---------------------")
    reverseElementInArrayUsingWhile()
}