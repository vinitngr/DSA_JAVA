package DSA;

import java.util.Arrays;

public class validSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','.','.','.','.','.','6','.'},
                {'.','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };



        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board){
        boolean[] line = new boolean[9];
        //check for row
        for (int i = 0; i < 9; i++) {
            Arrays.fill(line , false);
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int numeric = board[i][j] - '1';
                if(line[numeric]) return false;
                line[numeric] = true;
            }
        }
        System.out.println("rows clear");

        //check for box
        for (int i = 0; i < 9; i++) {
            Arrays.fill(line , false);
            int start = (i % 3)*3;
            int ceil = (i/3)*3 ;
            for (int j = ceil; j < ceil + 3 ; j++) {
                for (int r = start; r < start+3; r++) {
                    if(board[j][r] == '.') continue;
                    int numeric = board[j][r] - '1';
                    if(line[numeric]) return false;
                    line[numeric] = true;
                }
            }
        }
        System.out.println("box clear");

        for (int i = 0; i < 9; i++) {
            Arrays.fill(line , false);
            for (int r = 0; r < 9; r++) {
                if(board[r][i] == '.') continue;
                int numeric = board[r][i] - '1';
                if(line[numeric]) return false;
                line[numeric] = true;
            }
        }
        System.out.println("column clear");

        return true;
    }

}


//Replacing just one line -> Character.getNumericValue(board[r][c]) with board[r][c] - '1' significantly improved my runtime, boosting it to 100%.
//thanks to ChatGPT for that : -> refer DSA/notes/charAscii.md