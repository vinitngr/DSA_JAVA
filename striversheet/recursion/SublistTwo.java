package striversheet.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SublistTwo {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<List<Integer>> result = subsetsWithDup(nums);

        for(List<Integer> list : result ){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if (i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            end = res.size() - 1;
            for (int j = start; j <= end; j++) {
                List<Integer> subset = new ArrayList<>(res.get(j));
                subset.add(nums[i]);
                res.add(subset);
            }
        }
        return res;
    }

}
