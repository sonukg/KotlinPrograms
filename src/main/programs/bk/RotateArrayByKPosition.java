package bk;

import java.util.Arrays;

public class RotateArrayByKPosition {
    public static void rotateArray(int[] a,int n, int k){
        reverseArray(a,0,k-1);
        reverseArray(a,k,n-1);
        reverseArray(a,0,n-1);
    }

    public static void reverseArray(int[] arr, int start, int end){
        for (int i=start, j=end; i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        rotateArray(arr, arr.length, 2);
        System.out.println(Arrays.toString(arr));
    }
}


