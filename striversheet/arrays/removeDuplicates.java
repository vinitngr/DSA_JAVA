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
            foundUnique++;
            unique = nums[i];
        }

        return foundUnique;
    }
}

//good in memory , but perform bad in runtime, due to two array read per loop
//    public int removeDuplicates(int[] nums) {
//        int foundUnique = 1;
//        for(int i = 1 ; i < nums.length ; i++){
//            if(nums[i] != nums[i-1]){
//                nums[foundUnique] = nums[i];
//                foundUnique += 1;
//            }
//        }
//
//        return foundUnique;
//    }
