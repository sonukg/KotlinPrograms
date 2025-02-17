package Java;

import java.util.ArrayList;
import java.util.List;

public class MoreThanTwoVowels {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "mouse", "sky", "eleven"};
        List<String> validWordList = new ArrayList<>();
        for (String str : words) {
            int vowelCount = countVowels(str);
            if (vowelCount >= 2) {
                validWordList.add(str);
            }
        }
        System.out.println(validWordList);
    }

    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
