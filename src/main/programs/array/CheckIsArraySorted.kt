package array

fun isArraySorted(){
    var arr= intArrayOf(2,3,4,2,1,3,4)
    var arr1= intArrayOf(1,2,3,4,5)
    var isSorted=true
    for (i in 0 until arr1.size-1){
        if (arr1[i+1]< arr1[i]){
            isSorted=false
        }
    }
    println(isSorted)
}

fun isArraySortedWhile(){
    var arr1= intArrayOf(1,2,3,4,5)
    var isSorted=true
    var i=0
    while (i<arr1.size-1){
        if (arr1[i]> arr1[i+1]){
            isSorted=false
        }
        i++
    }
    println(isSorted)
}

fun main(){
isArraySorted()
    println("-------------------------")
    isArraySortedWhile()
}