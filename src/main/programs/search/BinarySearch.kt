package search

fun binarySearch(array: IntArray,target:Int):Int {
var low=0
    var high=array.size-1
    var i=1
    while (low<=high){
        println("Pass ${i}")
        i++
        var mid=low+(high-low)/2

        if (array[mid]==target) {
            return mid
        }else if (target<array[mid]) {
            high=mid-1
        } else  {
            low = mid + 1
        }

    }
    return -1
}

fun binarySearchOne(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.lastIndex

    while (left <= right) {
        val mid = (left + right) / 2  // Find middle index

        when {
            arr[mid] == target -> return mid  // Found
            arr[mid] < target -> left = mid + 1  // Search right half
            else -> right = mid - 1  // Search left half
        }
    }
    return -1  // Not found
}

fun main(){
var arr= intArrayOf(20,21,23,33,44,55,66,77,88,99)
    var target=88
    var result= binarySearch(arr,target)
    var result1= binarySearchOne(arr, target)
    if (result!=-1){
        println("Element found at position: ${result1}")
    }else{
        println("Element not found")
    }
}