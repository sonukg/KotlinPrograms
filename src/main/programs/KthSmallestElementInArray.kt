import java.util.*

fun main(){

    val arr = intArrayOf(7,10,4,3,20,15)
    val k = 4
    println(kthSmallest(arr,k))
    println(kthSmallestUsingPriorityQueue(arr, k))
    println(kthSmallestElement(arr, k))
}

//kth smallest element in a array using sorting
fun kthSmallest(arr: IntArray, k: Int): Int {
    arr.sort()
    return arr[k-1]
}


//kth smallest element in a array using priority queue
fun kthSmallestUsingPriorityQueue(arr: IntArray, k: Int): Int {
    val pq = PriorityQueue<Int>()
    for (i in arr) {
        pq.add(i)
    }
    for (i in 0 until k - 1) {
        pq.poll()
    }
    return pq.poll()
}


//kth smallest element in a array using priority queue and for each
fun kthSmallestElement(arr: IntArray, k: Int): Int {
    val minHeap = PriorityQueue<Int>()
    arr.forEach { minHeap.add(it) }
    repeat(k - 1) { minHeap.poll() }
    return minHeap.peek()
}
