package striversheet.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class sortColors {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 2, 0, 1, 2, 0, 2, 1, 1, 0, 2, 2, 1, 0, 0, 1, 1};
        sort_colors(nums);
    }

    public static void sort_colors(int[] nums){
        int twoReplaced = 0;
        int zeroReplaced = 0;
        for (int i = 0 ; i < nums.length - twoReplaced ; i++) {
            switch (nums[i]) {
                case 0:
                    int temp = nums[zeroReplaced];
                    nums[zeroReplaced] = nums[i];
                    nums[i] = temp;
                    zeroReplaced ++ ;
                    break;
                case 1:
                    break;
                case 2:
                    int temp2  = nums[nums.length - 1- twoReplaced];
                    nums[nums.length - 1- twoReplaced] = nums[i];
                    nums[i] = temp2;
                    twoReplaced ++ ;
                    i--;
                    break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

//took me 1.5 hours 🥲 i-- was major point , time to figure it out
// speed beat 100% , memory beat 49%