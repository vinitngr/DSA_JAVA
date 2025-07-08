package striversheet;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        int[] arr = {1,1,5};
        System.out.println(Arrays.toString(arr));
        getNext(arr);
    }
    public static void getNext(int[] arr){
        int pivot = -1;
        for (int i = arr.length -1 ; i > 0; i--) {
            if(arr[i-1] < arr[i]){
                pivot = i-1;
                break;
            }
        }
        for (int i = arr.length -1 ; i >= 0; i--) {
            if(pivot < 0) break;
            if(arr[pivot] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        int left = pivot+1;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
