package Java;

public class ThirdLargestNumber {

    public static void main(String[] args){
        int[] arr={2,4,5,6,7,8,9,10};
        int thirdLargestNum=findThirdLargestNumber(arr);
        System.out.println(thirdLargestNum);
    }

    public static int findThirdLargestNumber(int[] number){
        int largest=number[0];
        int secondLargest=0;
        int thirdLargest=0;
        for (int i=1;i<number.length;i++){
            if (number[i]> largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=number[i];

            } else if (number[i]>secondLargest && number[i] !=largest) {
                thirdLargest=secondLargest;
                secondLargest=number[i];
            } else if (number[i]>thirdLargest && number[i] !=largest) {
                thirdLargest=number[i];
            }
        }
        return thirdLargest;
    }
}
