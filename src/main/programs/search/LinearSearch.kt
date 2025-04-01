package search

fun linearSearch(array: IntArray,target:Int):Int{

    //search the element linearly from 0 to n
    for (i in array.indices){
        if (array[i]==target){
            return i
        }
    }
    return -1
}

fun main(){
    var arr= intArrayOf(2,8,92,7,82,22,33)
    var target=7
    var result = linearSearch(arr,target)

    if (result!=-1){
        println("Element found at position : ${result}")
    }else{
        println("Element not found")
    }
}