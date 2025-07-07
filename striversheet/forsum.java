package DSA_Practice.striversheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forsum {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        foursum(nums , 8);
    }

    public static void foursum(int[] nums ,int target){
        List<List<Integer>> listlist = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n-1 ; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < n ; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j+1;
                int right = n-1;

                long fixedSum = (long)nums[i] + (long)nums[j];
                while(right > left){
                    long sum = fixedSum + (long)nums[left] + (long)nums[right];
                    if( sum == (long) target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        listlist.add(list);

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }else if(sum > (long) target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }

        for (List<Integer> list: listlist){
            System.out.println(list);
        }
    }
}
