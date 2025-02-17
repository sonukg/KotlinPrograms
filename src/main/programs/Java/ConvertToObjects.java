package Java;

import java.util.Arrays;

public class ConvertToObjects {
    public static void main(String[] args){
        String[] strings = {"A", "B", "C"};
        Object[] objects = convertStringToObjects(strings);
        System.out.println(Arrays.toString(objects));
    }

    public static Object[] convertStringToObjects(String[] array) {
        Object[] objects = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
           // objects[i] = new JSONListAdapter().put("name", array[i]);
        }
        return objects;
    }
}


