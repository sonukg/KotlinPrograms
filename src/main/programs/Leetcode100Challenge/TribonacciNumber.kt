package Leetcode100Challenge
/*
LeetCode Challenge #1137. N-th Tribonacci Number
The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.



Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:

Input: n = 25
Output: 1389537


Constraints:

0 <= n <= 37
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
*/
fun main(){
var num=10
    var tib= tribonacciNumber(num)
    println("$tib is tribonacci number")
}
fun tribonacciNumber(num:Int):Int{
    if (num==0) return 0 else if (num==1 || num==2) return 1
    var firstTerm=0
    var secondTerm=1
    var thirdTerm=1

    for (i in 1..num){
        var fourthTerm= firstTerm+secondTerm+thirdTerm
        firstTerm=secondTerm
        secondTerm=thirdTerm
        thirdTerm=fourthTerm
    }
    return firstTerm
}