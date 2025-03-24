package array

fun findUniqueNumbersInArray() {
    val arr = intArrayOf(1, 2, 3, 4, 5,1,2,4)
    val uniqueNumbers = mutableListOf<Int>()

    for (i in arr.indices) {
        var hasDuplicate = false
        for (j in arr.indices) {
            if (i != j && arr[i] == arr[j]) {
                hasDuplicate = true
                break
            }
        }
        if (!hasDuplicate) {
            uniqueNumbers.add(arr[i])
        }
    }

    when {
        uniqueNumbers.isEmpty() -> println("All elements are duplicates.")
        else -> println("Unique numbers: ${uniqueNumbers.joinToString()}")
    }
}

fun main() {
    findUniqueNumbersInArray()
}