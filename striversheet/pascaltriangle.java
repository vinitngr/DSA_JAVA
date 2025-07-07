package DSA_Practice.striversheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascaltriangle {

    public static void main(String[] args) {
        List<List<Integer>> triangle = generate(5);

        for (List<Integer> innerList : triangle) {
            System.out.println(innerList);
        }
    }

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Triangle = new ArrayList<>();
        Triangle.add(new ArrayList<>(List.of(1)));
        if(numRows == 1) return Triangle;
        Triangle.add(new ArrayList<>(Arrays.asList(1 , 1)));
        for (int i = 2; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if(j == 0 || j == i ){
                    list.add(1);
                } else{
                    List<Integer> prev = Triangle.get(i-1);
                    Integer number = prev.get(j-1) + prev.get(j);
                    list.add(number);
                }

            }
            Triangle.add(list);
        }

        return Triangle ;
    }
}
