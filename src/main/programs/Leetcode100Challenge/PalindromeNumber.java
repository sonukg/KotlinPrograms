package Leetcode100Challenge;

public class PalindromeNumber {
    public static void main(String[] args){
        int num=123;
        boolean isPalin=isPalindrome(num);
        if (isPalin==true){
            System.out.println(num+" is palindrome number");
        }else {
            System.out.println(num+" is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int x){
        int num=x;
        int revNum=num;
        if (num < 0) return false;
        while (num > 0){
            int remainder = num % 10;
            revNum = revNum *10 +remainder;
            num = num /10;
        }

        if (revNum==x) {
            return true;
        }else {
            return false;
        }
    }


}
