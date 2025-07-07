package DSA_Practice.striversheet;
public class maxSum {
    public static void main(String[] args) {
        int[] arr = {0,-2};
        maxSubArray(arr);
    }

    public static void maxSubArray(int[] nums){
        int i = 1;
        int maxSum = nums[0];
        int currentSum = nums[0];

        while (i < nums.length) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
            i++;
        }


        System.out.println(maxSum);
    }
}



//tried my own method but failed at many condition , passed around 198/210 with my method , failed , eventually endue learning kadane's method from YouTube//
//beats - 99.6 runtime , 70 in memory

//old solution
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int move = 1;
//        int sum = nums[0];
//        int movingsum = nums[0];
//        while(move < nums.length){
//            int ISum = movingsum + nums[move];
//            if(ISum > 0){
//                if (ISum > sum) sum = ISum;
//                movingsum = Math.max(nums[move], ISum);
//            } else {
//                if(nums[move] > 0) {
//                    sum = nums[move];
//                    movingsum = nums[move];
//                } else {
//                    if (move + 1 < nums.length) {
//                        sum = Math.max(sum, nums[move + 1]);
//                        movingsum = nums[move + 1];
//                        move++;
//                    } else {
//                        sum = Math.max(sum, nums[move]);
//                        movingsum = nums[move];
//                    }
//                }
//            }
//            move++;
//        }
//        return sum;
//
//    }
//}

