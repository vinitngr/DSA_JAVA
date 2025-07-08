package striversheet;

import java.util.Arrays;
import java.util.HashSet;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 0},
                {3, 4, 0, 2},
                {1, 3, 1, 5}
        };;
        int[][] answer = setZeroes(matrix);

        for (int[] row : answer) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] setZeroes(int[][] matrix){
        HashSet<Integer> column = new HashSet<>();
        HashSet<Integer> row = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    column.add(j);
                    row.add(i);
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row.contains(i) || column.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix ;
    }
}
