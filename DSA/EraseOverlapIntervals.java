package DSA;

import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlapIntervals {

    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1,100},{90,110},{80,110},{70,90},{72,90},{73,90}, {30,70},{72,75}}));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1] , b[1]));
        int a = 0;
        int b = 1;
        int output = 0;
        while(b < intervals.length){
            if( intervals[a][1] > intervals[b][0] ){
                output ++;
                b++;
                continue;
            }
            a = b;
            b++;
        }
        return output;
    }

}
