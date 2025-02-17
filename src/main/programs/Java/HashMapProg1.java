package Java;

import java.util.*;

public class HashMapProg1 {

    public static void main(String[] args){
        String[] str={"This", "is", "kotlin", "android", "interview", "conducted"};
        HashMap<Integer,String> strKeyValue=findSizeAndValue(str);
        strKeyValue.forEach((key, value) -> System.out.println(key+ " " + value));
    }

    public static HashMap<Integer, String> findSizeAndValue(String[] str){
        HashMap<Integer,String> hashMap=new HashMap<>();
        for (String words:str){
            hashMap.put(words.length(), words);
        }
        return hashMap;
    }
}
