package striversheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class mergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4}, {0,0}};
        int[][] result = merge(intervals);

        for(int[] r : result){
            System.out.println(Arrays.toString(r));
        }
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> A = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= end){
                end = Math.max(end , intervals[i][1]);
            } else{
                A.add(new int[]{start , end});
                start = intervals[i][0];
                end = intervals[i][1];
            }

        }
        A.add(new int[]{start, end});
        return A.toArray(new int[A.size()][]);
    }
}


//didn't perform well in runtime , 25%
//harder than expected
//took 2 hours straight