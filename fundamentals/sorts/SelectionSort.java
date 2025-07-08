package fundamentals.sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1,333,-5,23,19};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int swapon = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[swapon]) {
                    swapon = j;
                }
            }
            if (swapon != i) swap(arr, i, swapon);
        }
    }
}

