package Leetcode100Challenge;

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
public class PowerOfTwo {

    public static void main(String args[]){
    int num=20;
    boolean isPowerOfTwos=isPowerOfTwo(num);
    if(isPowerOfTwos==true){
        System.out.println(num+" is a power of two");
    }else {
        System.out.println(num+" is a not power of two");
    }

    }

    public static boolean isPowerOfTwo(int num){
        if (num ==0){
            return false;
        }
        while (num % 2==0){
            num=num/2;
        }
        if (num==1){
            return true;
        }else {
            return false;
        }
    }
}
