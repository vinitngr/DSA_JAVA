class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][] matrix = new int[n][n];
        List<List<String>> stringList = new ArrayList<>();
        helper(stringList, matrix, n, new ArrayList<String>(), 0);
        return stringList;
    }

    public static void helper(
        List<List<String>> stringList,
        int[][] matrix,
        int n,
        List<String> currentList,
        int row) {

        if (row == n) {
            stringList.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (matrix[row][i] != 0) continue;

            alterMatrix(matrix, row, i, true);
            String string = createString(i, n);
            currentList.add(string);
            helper(stringList, matrix, n, currentList, row + 1);
            currentList.remove(currentList.size() - 1);
            alterMatrix(matrix, row, i, false);
        }
    }

    public static void alterMatrix(int[][] matrix, int row, int col, boolean add) {
        int val = add ? 1 : -1;

        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] += val;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] += val;
        }
        for (int i = 0; i < matrix.length; i++) {
            int j = i - (row - col);
            if (j >= 0 && j < matrix[i].length) {
                matrix[i][j] += val;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int j = (row + col) - i;
            if (j >= 0 && j < matrix[i].length) {
                matrix[i][j] += val;
            }
        }
    }

    public static String createString(int i, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int pos = 0; pos < length; pos++) {
            if (pos == i) {
                sb.append('Q');
            } else {
                sb.append('.');
            }
        }
        return sb.toString();
    }

}


//SET solution is other solution for that