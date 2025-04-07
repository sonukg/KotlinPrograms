package array

//Using left and right products (most efficient)
fun productOfArrayExceptSelf(nums:IntArray):IntArray{
    val n=nums.size
    val result=IntArray(n)
    result[0]=1

    for (i in 1 until n){
        result[i]=result[i-1] * nums[i-1]
    }

    var righProduct=1
    for (i in n-1 downTo 0){
        result[i] *=righProduct
        righProduct *=nums[i]
    }
    return result
}

fun productOfArrayExceptSelfFunctional(nums: IntArray):IntArray{
    return nums.indices.map { i->
        nums.filterIndexed { index, _ -> index!=i  }
            .fold(1){acc, num -> acc*num  }
    }.toIntArray()
}

fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    val leftProducts = IntArray(n) { 1 }
    val rightProducts = IntArray(n) { 1 }
    val result = IntArray(n)

    // Calculate left products
    for (i in 1 until n) {
        leftProducts[i] = leftProducts[i-1] * nums[i-1]
    }

    // Calculate right products
    for (i in n-2 downTo 0) {
        rightProducts[i] = rightProducts[i+1] * nums[i+1]
    }

    // Combine left and right products
    for (i in 0 until n) {
        result[i] = leftProducts[i] * rightProducts[i]
    }

    return result
}

fun main(){
    val nums = intArrayOf(1, 2, 3, 4)
    val result = productExceptSelf(nums)
    println("Result: ${result.contentToString()}")
}