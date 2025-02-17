package Java;

public class EvenOdd {
    public static void main(String[] args){
        int num=19;
        int evenOdd=findEvenOddNumber(num);
        System.out.println(evenOdd);
    }

    public static int findEvenOddNumber(int num){
        if (num % 2==0){
            System.out.println("Number is Even:");
        }else {
            System.out.println("Number is Not Prime:");
        }
        return num;
    }
}
