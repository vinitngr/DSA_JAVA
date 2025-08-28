class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(list, nums, new ArrayList<Integer>(), used);
        return list;
    }

     public static void helper(List<List<Integer>> list, int[] nums, List<Integer> currentList, boolean[] used) {
        if(currentList.size() == nums.length){
            list.add(new ArrayList<>(currentList));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++ ){
            if (used[i]) continue;
            // if(currentList.contains(nums[i])){
            //     continue;
            // }

            currentList.add(nums[i]);
            used[i] = true;

            helper(list , nums , currentList , used);
            currentList.remove(currentList.size() - 1);
            used[i] = false;
        }
    }
}