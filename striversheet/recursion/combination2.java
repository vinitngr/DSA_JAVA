class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> list = new ArrayList<>();
        function(list , candidates , target , new ArrayList<>() , 0 , 0);
        return list;
    }

    public static void function(
        List<List<Integer>> list , 
        int[] candidates , 
        int target ,
        List<Integer> currentList ,
        int currentSum, 
        int start
    ){
        if (currentSum >= target) {
            if (currentSum == target) {
                list.add(new ArrayList<>(currentList));
            }
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            currentList.add(candidates[i]);
            function(list, candidates, target, currentList, currentSum + candidates[i], i + 1);
            currentList.remove(currentList.size() - 1);
    }
    }
}