package Leetcode100Challenge
/*Day 6 of 100 Days LeetCode Challenge
LeetCode Challenge #1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they kotlin_fund_prog.add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/
fun main(){
    var arr= intArrayOf(2,7,11,15)
    var target=9
    var twoSum= twoSum(arr,target)
    println("Indices [${twoSum[0]},${twoSum[1]}]")
}

fun twoSum(nums:IntArray, target:Int):IntArray{
    var index = IntArray(2)


    for (i in nums.indices){
        for (j in i+1 until nums.size ){
            if (nums[i]+nums[j]==target){
                index[0]=i
                index[j]=j
            }
        }
    }
    return index
}

// solve this using easy and optimal solution
fun twoSumOptimal(nums: IntArray, target: Int): IntArray {
    val numToIndex = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        val complement = target - nums[i]
        if (numToIndex.containsKey(complement)) {
            return intArrayOf(numToIndex[complement]!!, i)
        }
        numToIndex[nums[i]] = i
    }

    throw IllegalArgumentException("No two sum solution")
}