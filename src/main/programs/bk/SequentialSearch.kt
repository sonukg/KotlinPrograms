package bk

fun sequentialSearch(array: IntArray,size: Int,value: Int): Int{
    for (i in array.indices){
        if (value==array[i]){
            return i
        }
    }
    return -1

}

fun main(){
    val array=intArrayOf(1,2,3,4,5,6,7,8,9)
    val size=array.size
    val value=8
    val result=sequentialSearch(array,size,value)
    println(result)
}