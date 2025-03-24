package array


fun main(){
    var nums= intArrayOf(3,0,1)
    var result= findMissingNumber(nums)
    println("Missing number is ${result}")
}

fun findMissingNumber(nums:IntArray):Int{
    var range=nums.size
    var actualSum = (range * (range + 1))/2 // formula n*(n=1)/2
    var currentSum = 0
    for (i in nums.indices){
        currentSum = currentSum + nums[i]
    }

    var ans= actualSum-currentSum
    return ans

}