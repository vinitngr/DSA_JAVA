package striversheet.arrays;

class removeDuplicates {
    public int removeDuplicate(int[] nums) {
        int foundUnique = 1;
        int unique = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == unique){
                continue;
            }
            nums[foundUnique] = nums[i];
            foundUnique += 1;
            unique = nums[i];
        }

        return foundUnique;
    }
}