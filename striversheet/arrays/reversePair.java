package striversheet.arrays;

import java.util.Arrays;

public class reversePair {
    static int pair = 0;
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,1,5,1};
        reversePairs(arr);
        System.out.println(pair);
    }

    public static void reversePairs(int[] nums){
        mergeSort(nums);
    }

    public static int[] mergeSort(int[] nums) {

        if(nums.length == 1){
            return nums;
        }
        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums , 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums , mid , nums.length));

        return merge(left  , right);
    }

    public static int[] merge(int[] left , int[] right){

        int r = 0;
        for (int i = 0; i < left.length && r <= right.length; i++) {
            while(r < right.length){
                if(left[i] > right[r]*2){
                    pair = pair + left.length-i ;
                    r++;
                } else{
                    break;
                }
            }
        }
        int[] mix = new int[left.length + right.length];

        int i =0;
        int j =0;
        int k =0;

        while(i< left.length && j < right.length){
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}


//just ugly brute force , time limit exceeded
//int pair = 0;
//int smallest= Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length-1; i++) {
//        if( i != 0 && nums[i]/2 < smallest ) continue;
//        for (int j = i+1; j < nums.length; j++) {
//        if ((long)nums[i] > 2L * nums[j]) {
//pair++;
//        }
//smallest = Math.min(nums[j] , smallest );
//
//            }
//                    }
//
//                    return pair;