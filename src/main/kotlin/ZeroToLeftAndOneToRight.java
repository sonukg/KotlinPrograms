import java.util.Arrays;

public class ZeroToLeftAndOneToRight {

    public static void main(String[] args){
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        moveZeroesAndOnes(arr);
        //moveZeroesAndOnesUsingForLoop(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer until it encounters a 1
            while (arr[left] == 0 && left < right) {
                left++;
            }

            // Move right pointer until it encounters a 0
            while (arr[right] == 1 && left < right) {
                right--;
            }

            // Swap the values at the left and right pointers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void moveZeroesAndOnesUsingForLoop(int[] arr) {
        int zeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;
                zeroIndex++;
            }
        }
    }
}
