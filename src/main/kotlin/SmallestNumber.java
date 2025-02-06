public class SmallestNumber {
    public static void main(String[] args){
        int[] arr={1,3,5,6,7,8,9,19};
        int smallestNum=findSmallest(arr);
        System.out.println(smallestNum);
    }

    public static int findSmallest(int[] number){


        int smallestNumber=number[0];
        for(int i=1;i<number.length;i++){
            if(number[i]<smallestNumber){
                smallestNumber=number[i];
            }
        }
        return smallestNumber;
    }
}
