import java.util.HashMap;
import java.util.Map;

public class StringToKeyValues {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C", "Z", "Q"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], i);
        }
        System.out.println(map);
    }
}
