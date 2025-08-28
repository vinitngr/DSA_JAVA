class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> list = new ArrayList<>();
        function(list, candidates, target, new ArrayList<>(), 0, 0);
        return list;
    }

    public static void function(List<List<Integer>> list, int[] candidates, int target,List<Integer> currentList, int currentSum, int start) {
        if (currentSum >= target) {
            if (currentSum == target) {
                list.add(new ArrayList<>(currentList));
            }
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (currentSum + candidates[i] > target) return; 
            currentList.add(candidates[i]);
            function(list, candidates, target, currentList, currentSum + candidates[i], i);
            currentList.remove(currentList.size() - 1);
        }
    }
}