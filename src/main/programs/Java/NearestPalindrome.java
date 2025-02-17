package Java;

public class NearestPalindrome {
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

    public static void main(String[] args) {
        int num = 123;
        System.out.println("Nearest Palindrome: " + nearestPalindrome(num));
    }
}
