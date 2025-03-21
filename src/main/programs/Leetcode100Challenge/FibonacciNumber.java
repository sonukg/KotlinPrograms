package Leetcode100Challenge;
/*
LeetCode Challenge #509. Fibonacci Number
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
        Given n, calculate F(n).



Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.


Constraints:

        0 <= n <= 30
*/

public class FibonacciNumber {

    public static void main(String args[]){
        int num=20;
        int fib=fibonacciNumber(num);
        System.out.println(fib+" is a fibonacci number");
    }

    private static int fibonacciNumber(int num) {
        if (num==0) return 0;
        else if (num==1) return 1;
        int firstTerm=0;
        int secondTerm=1;
        for (int i=1; i<=num;i++){
            int thirdTerm= firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=thirdTerm;
        }
        return firstTerm;
    }
}
