package Leetcode100Challenge

/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.



Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false


Constraints:

-231 <= n <= 231 - 1
 */

fun main(){
    var num=16
    val ispoweroftwo= isPowerOfTwo(num)
    if (ispoweroftwo==true){
        println("$num is power of two")
    }else{
        println("$num is not power of two")
    }
}

fun isPowerOfTwo(n:Int):Boolean{
    var num=n
    if (num ==0) return false
    while (num % 2==0){
        num = num/2
    }
    if (num==1) return true else return false
}