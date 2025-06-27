package bk

fun binarySearch(array: IntArray,size: Int,value: Int): Int{
    var mid: Int
    var low=0
    var high=size-1
    while (low<=high){
        mid=(low+high) / 2
        if (array[mid]==value){
            return mid
        }else{
            if (array[mid] < value){
                low=mid+1
            }else{
                high=mid-1
            }
        }
    }
    return -1
}

fun main(){
    val array=intArrayOf(1,2,3,4,5,6,7,8,9)
    val size=array.size
    val value=7
    val result=binarySearch(array,size,value)
    println(result)
}