package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class EncodeAndDecodeStrings {
    private static final char DELIMITER = '#';

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length())
                    .append(DELIMITER)
                    .append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // Find the delimiter
            int delimiterIndex = str.indexOf(DELIMITER, i);

            // Get the length of next string
            int length = Integer.parseInt(str.substring(i, delimiterIndex));

            // Extract the string
            String substring = str.substring(delimiterIndex + 1,
                    delimiterIndex + 1 + length);
            decoded.add(substring);

            // Move pointer to start of next length
            i = delimiterIndex + 1 + length;
        }

        return decoded;
    }

    public static void main(String[] args) {
        EncodeAndDecodeStrings codec = new EncodeAndDecodeStrings();
        List<String> input = Arrays.asList("Hello", "World", "!");

        String encoded = codec.encode(input);
        List<String> decoded = codec.decode(encoded);

        System.out.println("Original: " + input);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}
