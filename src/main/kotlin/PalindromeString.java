public class PalindromeString {
    public static void main(String[] args){
        String str="Radar", reverseString="";
        reverseString=findPalindromeString(str);
        System.out.println(reverseString);
    }

    public static String findPalindromeString(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if (str.toLowerCase().equals(reverse.toLowerCase())){
            System.out.println("This is Palindrome String ");
        }else {
            System.out.println("This is Palindrome String ");
        }
        return reverse;
    }
}
