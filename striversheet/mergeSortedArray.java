package DSA_Practice.striversheet;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-2,0, 13, 0, 0 , 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1 , m , nums2 , n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m+n;
        for (int i = 1; i <= length; i++) {

            if(m<=0){
                nums1[length-i] = nums2[n-1];
                n--;
            }
            else if(n<=0){
                nums1[length-i] = nums1[m-1];
                m--;
            }
            else if(nums1[m-1] > nums2[n-1]){
                nums1[length-i] = nums1[m-1];
                m--;
            } else{
                nums1[length-i] = nums2[n-1];
                n--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}


//easy BRUHH.
//beats 100.00%
//memory 42.47%