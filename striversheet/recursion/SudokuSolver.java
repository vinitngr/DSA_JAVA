class Solution {
    public void solveSudoku(char[][] board) {
        boolean[][] row = new boolean[9][10];
        boolean[][] col = new boolean[9][10];
        boolean[][] shell = new boolean[9][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    row[i][num] = col[j][num] = shell[boxIndex][num] = true;
                }
            }
        }
        helper(row, col, shell, board, 0, 0);
    }

    public static boolean helper(
            boolean[][] row,
            boolean[][] col,
            boolean[][] shell,
            char[][] board,
            int currentRow,
            int currentCol) {
        if (currentRow == 9)
            return true;

        int nextRow = (currentCol == 8) ? currentRow + 1 : currentRow;
        int nextCol = (currentCol + 1) % 9;

        if (board[currentRow][currentCol] != '.') {
            return helper(row, col, shell, board, nextRow, nextCol);
        } else {
            for (int num = 1; num <= 9; num++) {
                int boxIndex = (currentRow / 3) * 3 + (currentCol / 3);

                if (row[currentRow][num] || col[currentCol][num] || shell[boxIndex][num])
                    continue;

                row[currentRow][num] = col[currentCol][num] = shell[boxIndex][num] = true;
                board[currentRow][currentCol] = (char) ('0' + num);

                if (helper(row, col, shell, board, nextRow, nextCol)) return true;

                row[currentRow][num] = col[currentCol][num] = shell[boxIndex][num] = false;
                board[currentRow][currentCol] = '.';
            }
        }
        return false;
    }

}