package striversheet.arrays;

public class maxconsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
            i++;
        }

        return maxCount;
    }
}
