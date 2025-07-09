package fundamentals.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,333,-5,23,19};
        sort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr , int left ,int right){
        if(left >= right) return ;
        int p = partition(arr, left , right);

        sort(arr, left, p-1);
        sort(arr, 1 + p, right);
    }

    public static int partition(int[] arr ,int left , int right){
        int i= left -1;
        int pivot = arr[right] ;

        for (int k = left; k < right; k++) {
            if (arr[k] < pivot) {
                i++;
                swap(arr, i, k);
            }
        }
        swap(arr, i + 1, right);
        return i+1;
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
