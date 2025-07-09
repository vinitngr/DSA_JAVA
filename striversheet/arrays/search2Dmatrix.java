package striversheet.arrays;

public class search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {-8, -7, -5, -3, -3, -1, 1},
                {2, 2, 2, 3, 3, 5, 7},
                {8, 9, 11, 11, 13, 15, 17},
                {18, 18, 18, 20, 20, 20, 21},
                {23, 24, 26, 26, 26, 27, 27},
                {28, 29, 29, 30, 32, 32, 34}
        };



        System.out.print(searchMatrix(matrix , 29));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int bottom = matrix.length-1;
        int top = 0;
        while(bottom >=  top) {
            int center = (bottom + top) / 2;
            if (target == matrix[center][0]) return true;
            if (target > matrix[center][0]) top = center + 1;
            else bottom = center - 1;
        }

        if( bottom < 0 ) return false;

        int right = matrix[bottom].length-1;
        int left = 0;
        while(right >= left){
            int center2 = (left+right)/2;
            if(target == matrix[bottom][center2]) return true;
            if(target > matrix[bottom][center2]) left = center2+1;
            else right = center2-1;
        }
        return false;
    }
}
