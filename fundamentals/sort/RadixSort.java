package fundamentals.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] nums = {7,222,22,6,5,1,9,23,1};
        sort(nums);

    }

    public static void sort(int[] nums){
        int[] output = nums.clone();


        //find max
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }

        int k = (int) Math.log10(max)+1;
        System.out.println("arr input : " + Arrays.toString(nums));

        //loop over all digit , max is k
        for (int i = 0; i < k; i++) {

            int divide = (int)Math.pow(10 , i );
            int[] position = new int[10];
            //check each number in nums and change the value of output
            for (int value : output) {
                position[(value / divide) % 10] += 1;
            }
            //add each so we can find out position for each digit
            for (int j = 1; j < position.length; j++) {
                position[j] = position[j] + position[j-1];
            }

            //change in output array
            for (int j = nums.length - 1; j >= 0; j--) {
                int digit = (nums[j] / divide) % 10;
                output[--position[digit]] = nums[j];
            }

            //copy output to nums / to populate changes
            for (int j = 0; j < output.length; j++) {
                nums[j] = output[j];
            }

            System.out.printf("arr %s : %s \n" , i+1 == k ?  "final" : Integer.toString(i+1) , Arrays.toString(nums));
        }
    }
}
