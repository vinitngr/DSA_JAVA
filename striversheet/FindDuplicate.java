package striversheet;


public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,2,2, 2, 2};
        findDuplicate(nums);
    }

    public static void findDuplicate(int[] nums) {
        //so solving it by understanding this logic less approach
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (fast != slow) {
            slow = nums[slow];
            fast = nums[fast];
        }

        System.out.println(slow);

    }
}


//also an approach without crying about space
//good for small input , perform even better then above one memory wise
//Set<Integer> set = new HashSet<>();
//int duplicate = -1;
//        for (int i = 0 ; i < nums.length ; i++) {
//        set.add(nums[i]);
//            if (set.size() != i+1) {
//duplicate = nums[i];
//        break;
//        }
//        }


//tried set , map , brute , sort methods but all unsatisfy the condition except Tortoise Hare
//Tortoise Hare make no sense in real life use , almost impossible to get pattern and approach
