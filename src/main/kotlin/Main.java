

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] strings = {"A", "B", "C"};
        Object[] objects = stringToObjects(strings);
        System.out.println(Arrays.toString(objects));
    }

    public static Object[] stringToObjects(String[] str) {
        Object[] obj = new Object[str.length];
        for (int i = 0; i < str.length; i++) {
            //obj[i] = new JSONObject().put("name", str[i]);
        }
        return obj;
    }
}