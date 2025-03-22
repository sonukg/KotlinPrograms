package Leetcode100Challenge

/*LeetCode Challenge #1464. Maximum Product of Two Elements in an Array
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).



Example 1:

Input: nums = [3,4,5,2]
Output: 12
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12


Constraints:

2 <= nums.length <= 500
1 <= nums[i] <= 10^3
*/

fun main(){
    var max= intArrayOf(3,4,5,2)
    var result= maxProduct(max)
    println(result)
}
fun maxProduct(arr:IntArray):Int{
    var max=-1
    var secondMax=-1
    for (i in arr.indices){
        if (max<arr[i]){
            secondMax=max
            max=arr[i]
        }else if (secondMax < arr[i] ){
            secondMax=arr[i]
        }
    }
    var ans=(max-1) * (secondMax-1)
    return ans
}