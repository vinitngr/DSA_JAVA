package striversheet.greedy;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3} , new int[]{1,3}));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int gpointer = 0;
        int spointer = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(gpointer < g.length && spointer < s.length){
            if(g[gpointer] <= s[spointer]){
                gpointer++;
            }
            spointer++;
        }
        return gpointer;
    }
}
