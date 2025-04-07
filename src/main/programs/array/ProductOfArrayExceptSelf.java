package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Initialize result array with 1s
        result[0] = 1;

        // Calculate left products
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        // Calculate right products and combine
        int rightProduct = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
