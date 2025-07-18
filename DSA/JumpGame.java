package DSA;

public class JumpGame {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,1}));
    }
    public static boolean canJump(int[] nums) {
        int k = 0;
        int kmax = nums[0];
        int index = 0;
        int current = 0;
        while (current < nums.length) {
            if (nums[current] >= (nums.length - 1 - current)) {
                return true;
            }
            if (nums[current] == 0 && k >= kmax) {
                return false;
            }
            if (nums[current] + k > nums[index]) {
                index = current;
                k = 0;
                kmax = nums[index];
            }

            k++;
            current++;
        }

        return true;
    }
}
