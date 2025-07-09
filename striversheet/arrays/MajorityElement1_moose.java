package striversheet.arrays;

public class MajorityElement1_moose {
    public static void main(String[] args) {
        int[] nums = {1,2, 1 , 2, 2, 2};
        System.out.println(majorityElement1(nums));
    }

    public static int majorityElement1(int[] nums){
        int count= 0 ;
        int result=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(count == 0) result = nums[i];

            if(nums[i] == result){
                count ++;
            }else{
                count--;
            }
        }

        return result;
    }
}
