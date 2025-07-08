package striversheet;

import java.util.Arrays;

public class reversePair {

    static int count = 0;

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        reversePairs(nums);
        System.out.println("Reverse pairs count: " + count);
    }

    public static void reversePairs(int[] nums){
        //todo
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