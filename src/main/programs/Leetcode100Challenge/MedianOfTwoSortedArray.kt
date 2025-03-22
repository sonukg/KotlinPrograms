package Leetcode100Challenge

/*
LeetCode Challenge #4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/


fun main(){
 var arr1= intArrayOf(1,2)
    var arr2= intArrayOf(3,4)
    var result= medianOfTwoSortedArray(arr1,arr2)
    println(result)
}

fun medianOfTwoSortedArray(arr1:IntArray,arr2:IntArray):Double{
    var ans = merge(arr1,arr2)
    if (ans.size % 2==0){
        var ans2=(ans[ans.size / 2] + ans[ans.size / 2 - 1]) / 2.0

        return ans2
    }else{
        var ans2=ans[ans.size / 2].toDouble()
        return ans2
    }
}

fun merge(arr1:IntArray,arr2:IntArray):IntArray{

    var ans = IntArray( arr1.size+arr2.size)
    var p1=0
    var p2=0
    var p3=0


    while (p1<arr1.size || p2<arr2.size){
        val val1 = if (p1 < arr1.size) arr1[p1] else Int.MAX_VALUE
        val val2 = if (p2 < arr2.size) arr2[p2] else Int.MAX_VALUE

        if (val1<val2){
            ans[p3]=val1
            p1++
        }else{
            ans[p3]=val2
            p2++
        }
        p3++
    }
    return ans
}