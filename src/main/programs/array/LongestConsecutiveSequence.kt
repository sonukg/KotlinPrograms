package array


class LongestConsecutiveSequence {
    fun longestConsecutiveUsingHashmap(nums: IntArray): Int {
        // Convert array to set for O(1) lookups
        val numSet = nums.toSet()

        return numSet.maxOf { num ->
            // Only check sequences from their first number
            if (num - 1 !in numSet) {
                generateSequence(num + 1) { it + 1 }
                    .takeWhile { it in numSet }
                    .count() + 1
            } else 0
        }
    }


    fun longestConsecutiveUsingSorting(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        // Sort the array
        nums.sort()

        var longestStreak = 1
        var currentStreak = 1

        for (i in 1 until nums.size) {
            when {
                nums[i] == nums[i-1] -> continue // Skip duplicates
                nums[i] == nums[i-1] + 1 -> currentStreak++
                else -> {
                    longestStreak = maxOf(longestStreak, currentStreak)
                    currentStreak = 1
                }
            }
        }

        return maxOf(longestStreak, currentStreak)
    }
}

fun main() {
    val solution = LongestConsecutiveSequence()
    val nums = intArrayOf(100, 4, 200, 1, 3, 2)
    println("Longest consecutive sequence: ${solution.longestConsecutiveUsingHashmap(nums)}")
}