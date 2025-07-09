package striversheet.arrays;

public class rotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        rotator(matrix);
    }

    static void rotator(int[][] matrix){
        int ml = matrix.length;
        for (int i = 0; i < ml /2 ; i++) {
            for (int j = i; j < ml-1-i ; j++) {
                swap(matrix , i , j , j , ml-1-i );
                swap(matrix , i , j , ml-1-i , ml-1-j );
                swap(matrix , i , j , ml-1-j , i );
            }
        }

        printMatrix(matrix);
    }

    static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}

//============stats==============//
// took 1 hr to solve
// RunTime beats 100%
// memory beats 25%
//on second submit with same code beats 16% and then 77.46% , leetcode is high on weed