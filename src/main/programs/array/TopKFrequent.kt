package array

import java.util.PriorityQueue

fun topKFrequentPQ(nums:IntArray,k:Int):IntArray{
val frequencyMap= mutableMapOf<Int,Int>()
    nums.forEach { num->
        frequencyMap[num] = frequencyMap.getOrDefault(num,0)+1
    }

    val pq=PriorityQueue<Map.Entry<Int,Int>>{a,b->
        b.value-a.value
    }
    pq.addAll(frequencyMap.entries)
    return IntArray(k){pq.poll().key}
}

fun findTopKFrequent(nums: IntArray, k: Int): IntArray {
    return nums.toList()
        .groupingBy { it }
        .eachCount()
        .entries
        .sortedByDescending { it.value }
        .take(k)
        .map { it.key }
        .toIntArray()
}



fun main(){
    val num= intArrayOf(1,1,1,2,2,3)
    val k=2
    //val result= topKFrequentPQ(num,k)
    val result= findTopKFrequent(num,k)
    println("Top $k frequent element: ${result.contentToString()}")
}