package Java;

public class FindOccurenceInList {

    public static void main(String[] args){
        String arr = "sonukumar";
        String a = "uku";
        boolean isPresent = false;

        for (int i = 0; i <= arr.length() - a.length(); i++) {
            int j;
            for (j = 0; j < a.length(); j++) {
                if (arr.charAt(i + j) != a.charAt(j)) {
                    break;
                }
            }
            if (j == a.length()) {
                isPresent = true;
                break;
            }
        }

        System.out.println(isPresent);
    }
}
