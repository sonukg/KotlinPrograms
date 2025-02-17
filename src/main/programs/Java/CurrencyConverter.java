package Java;

public class CurrencyConverter {

    private static final String[] ones = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"
    };
    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private static final String[] hundreds = {
            "", "Hundred", "Thousands", "Lakhs", "Crores"
    };

    public static String convertNumberToWords(double number) {
        String words = "";

        // Separate the whole number from the decimal part
        int wholeNumber = (int) number;
        double decimalPart = number - wholeNumber;

        // Convert the whole number to words
        for (int i = 0; i < hundreds.length; i++) {
            int digit = wholeNumber % 1000;
            if (digit > 0) {
                words += convertThreeDigitNumberToWords(digit) + " " + hundreds[i] + " ";
                wholeNumber /= 1000;
            }
        }

        // Convert the decimal part to words
        if (decimalPart > 0) {
            words += convertFractionToWords(decimalPart);
        }

        return words.trim();
    }

    private static String convertThreeDigitNumberToWords(int number) {
        String words = "";

        int digit = number % 100;
        if (digit >= 10 && digit < 20) {
            words += tens[digit - 10];
        } else if (digit >= 20) {
            words += tens[digit / 10] + " " + ones[digit % 10];
        } else {
            words += ones[digit];
        }

        digit = number / 100;
        if (digit > 0) {
            words = ones[digit] + " Hundred " + words;
        }

        return words;
    }

    private static String convertFractionToWords(double decimalPart) {
        decimalPart *= 100;
        int cents = (int) decimalPart;

        String words = "" + ones[cents / 10] + " Paise " + ones[cents % 10];

        return words;
    }
}


