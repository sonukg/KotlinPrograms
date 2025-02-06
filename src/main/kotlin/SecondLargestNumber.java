public class SecondLargestNumber {

    public static void main(String[] args){
        int[] arr={2,4,5,6,7,8,9,10};
        int secondLargestNum=findSecondLargestNumber(arr);
        System.out.println(secondLargestNum);
    }

    public static int findSecondLargestNumber(int[] number){
        int largest=number[0];
        int secondLargest=0;
        for (int i=1;i<number.length;i++){
            if (number[i]> largest){
                secondLargest=largest;
                largest=number[i];

            } else if (number[i]>secondLargest && number[i] !=largest) {
                secondLargest=number[i];
            }
        }
        return secondLargest;
    }
}
