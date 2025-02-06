public class ReverseNumber {
    public static void main(String[] args){

        int number=23456;
        int reverseNumber=findReverseNumberBYWhileLoop(number);
        System.out.println(reverseNumber);
    }

    public static int findReverseNumberBYForLoop(int num){
        int reverseNum=0;
        for (;num!=0; num/=10){
            int num1=num%10;
            reverseNum= reverseNum*10+num1;
        }
        return reverseNum;
    }

    public static int findReverseNumberBYWhileLoop(int num){
        int reverseNum=0;
        while (num!=0){
            int digit=num%10;
            reverseNum=reverseNum*10+digit;
            num /=10;
        }
        return reverseNum;
    }
}
