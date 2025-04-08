package strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        countVowelsAndConsonants(input);
        scanner.close();
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        // Convert string to lowercase
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if character is a consonant
            else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("Input String: " + str);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
