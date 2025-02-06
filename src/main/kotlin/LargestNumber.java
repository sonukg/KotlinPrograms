/* Java program to find biggest element in array
    Finding Largest Number from Array in Java
    Find maximum element in an array
    Find Biggest Element in Array*/
public class LargestNumber {

    public static void main(String[] args){
        int[] arr={1,3,5,6,7,8,9,19};
        int largestNum=findLargest(arr);
        System.out.println(largestNum);
    }

    public static int findLargest(int[] number){


        int largestNumber=number[0];
        for(int i=1;i<number.length;i++){
           if(number[i]>largestNumber){
            largestNumber=number[i];
           }
        }
        return largestNumber;
    }
}
