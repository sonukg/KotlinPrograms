package bk

fun rotateArray(a: IntArray, n: Int, k: Int) {
    reverseArray(a, 0, k - 1)
    reverseArray(a, k, n - 1)
    reverseArray(a, 0, n - 1)
}

fun reverseArray(arr: IntArray, start: Int, end: Int) {
    var i = start
    var j = end
    while (i < j) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6)
    rotateArray(arr, arr.size, 2)
    println(arr.joinToString(" "))
}