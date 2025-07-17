package striversheet.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        for(List<Integer> list : result){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> main = new LinkedList<>();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }


        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {

            int sum = nums[left] + nums[right] + nums[i];
            if (sum == 0) {
                List<Integer> list = new LinkedList<>();
                list.add(nums[i]);
                list.add(nums[left]);
                list.add(nums[right]);
                main.add(list);

                left++;
                right--;

                while (left < right && nums[left] == nums[left - 1]) left++;
                while (left < right && nums[right] == nums[right + 1]) right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        i++;
        }

        return main;
    }
}
