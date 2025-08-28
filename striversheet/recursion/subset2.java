class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> mySet = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        subset(mySet, current, nums, 0, 0);
        return new ArrayList<>(mySet);
    }

    public static void subset(Set<List<Integer>> mySet, List<Integer> current, int[] nums, int node ,int index) {
        if (index >= nums.length) {
            mySet.add(new ArrayList<>(current));
            return;
        }

        subset(mySet, current, nums, node, index + 1);
        current.add(nums[index]);
        subset(mySet, current, nums, node, index + 1);
        current.remove(current.size() - 1);

       if (index == node) {
            int nextNode = node;
            while (nextNode + 1 < nums.length && nums[nextNode] == nums[nextNode + 1]) {
                nextNode++;
            }
            subset(mySet, new ArrayList<>(), nums, nextNode + 1, nextNode + 1);
        }

    }
}