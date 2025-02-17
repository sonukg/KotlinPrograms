package Java;

public class PalindromeNumber {
    public static void main(String[] args) {

        int number = 3553;
        int reverseNumber = findPalindromeNumberBYWhileLoop(number);
        System.out.println("Nearest palindrome"+isPalindrome(nearestPalindrome(number)));
        if (number == reverseNumber) {
            System.out.println(number + ": is Palindrome Number");
        } else {
            System.out.println(number + " :is not Palindrome Number");
        }
    }

    public static int findPalindromeNumberBYForLoop(int num) {
        int reverseNum = 0, remainder;
        for (; num != 0; num /= 10) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
        }

        return reverseNum;
    }

    public static int findPalindromeNumberBYWhileLoop(int num) {
        int reverseNum = 0, remainder;
        while (num != 0) {
            remainder = num % 10;
            reverseNum = reverseNum * 10 + remainder;
            num /= 10;
        }
        return reverseNum;
    }


        public static boolean isPalindrome(int n) {
            String s = String.valueOf(n);
            return s.equals(new StringBuilder(s).reverse().toString());
        }

        public static int nearestPalindrome(int n) {
            int smaller = n - 1, larger = n + 1;
            while (true) {
                if (isPalindrome(smaller)) return smaller;
                if (isPalindrome(larger)) return larger;
                smaller--;
                larger++;
            }


        }


}
