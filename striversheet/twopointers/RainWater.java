package striversheet.twopointers;

public class RainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{6,8,5,0,0,6,}));
    }
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length -1;
        int vol = 0;
        int leftMax = height[left];
        int rightMax = height[right];
        while(left < right){
            if( height[left] > height[right] ){
                right--;
                rightMax = Math.max(rightMax , height[right]);
                vol += rightMax - height[right];
            } else {
                left++;
                leftMax = Math.max(leftMax , height[left]);
                vol += leftMax - height[left];
            }
        }
        return vol;
    }
}
