package striversheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] nums = {1};
        long start1 = System.nanoTime();
        System.out.print(majorityElement(nums) + "\t");
        long end1 = System.nanoTime();
        System.out.println("majorityElement time: " + (end1 - start1) / 1_000_000.0 + " ms");

        long start2 = System.nanoTime();
        System.out.print(majorityElement2(nums) + "\t");
        long end2 = System.nanoTime();
        System.out.println("majorityElement2 time: " + (end2 - start2) / 1_000_000.0 + " ms");

    }



    //way two
    public static List<Integer> majorityElement(int[] nums) {
            int candidate1 = 0, candidate2 = 1;
            int count1 = 0, count2 = 0;

            for (int num : nums) {
                if (num == candidate1) count1++;
                else if (num == candidate2) count2++;
                else if (count1 == 0) {
                    candidate1 = num;
                    count1 = 1;
                } else if (count2 == 0) {
                    candidate2 = num;
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }

            count1 = 0;
            count2 = 0;
            for (int num : nums) {
                if (num == candidate1) count1++;
                else if (num == candidate2) count2++;
            }

            List<Integer> result = new ArrayList<>();
            int tol = nums.length / 3;
            if (count1 > tol) result.add(candidate1);
            if (count2 > tol) result.add(candidate2);
            return result;
        }



        public static List<Integer> majorityElement2(int[] nums) {
            HashMap<Integer , Integer> map = new HashMap<>();
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                int times = map.getOrDefault(num, 0) + 1;
                map.put(num, times);
            }
            for (Integer key : map.keySet()) {
                if(map.get(key) > nums.length/3){
                    list.add(key);
                }
            }
            return list;
        }
}
