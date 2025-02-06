public class SmallestLargestNumber {
    public static void main(String[] args){
        int[] arr={1,3,5,6,7,8,9,19};
        int largestNum=findLargest(arr);
        System.out.println(largestNum);
    }

    public static int findLargest(int[] number){


        int largestNumber=Integer.MIN_VALUE;
        int smallestNumber=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i]>largestNumber){
                largestNumber=number[i];
            }

            if (number[i]<smallestNumber){
                smallestNumber=number[i];
            }
        }
        return smallestNumber;
    }
}
