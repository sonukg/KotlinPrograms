
import java.util.Arrays;

public class AddParenthesis {

    public static void main(String[] args) {
        String[] words = {"dog", "cat", "mouse", "sky", "eleven"};
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int vowelCount = countVowels(word);
            if (vowelCount >= 2) {
                words[i] = addParentheses(word);
            }
        }
        System.out.println(Arrays.toString(words));
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

    public static String addParentheses(String word) {
        StringBuilder sb = new StringBuilder();
        boolean inParentheses = false;
        for (char c : word.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                if (!inParentheses) {
                    sb.append("(");
                    inParentheses = true;
                }
                sb.append(c);
            } else {
                if (inParentheses) {
                    sb.append(")");
                    inParentheses = false;
                }
                sb.append(c);
            }
        }
        if (inParentheses) {
            sb.append(")");
        }
        return sb.toString();
    }
}
