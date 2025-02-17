package Java;

public class ReverseString {

    public static void main(String[] args){
        String str="This is a girl";
        String reverseString=findReverseString(str);
        System.out.println(reverseString);
    }

    public static String findReverseString(String str){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){

            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
