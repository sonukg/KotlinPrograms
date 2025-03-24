package array

fun mergeTwoSortedArrays(){
    var arr1= intArrayOf(1,2,3,4,5)
    var arr2= intArrayOf(6,7,8,9,19)
    var merged= mutableListOf<Int>()


    for (num in arr1) {
        merged.add(num)
    }
    for (num in arr2) {
        merged.add(num)
    }

    merged.sort()

    println("Merged sorted array: ${merged.joinToString()}")

}

fun main(){
    mergeTwoSortedArrays()
}