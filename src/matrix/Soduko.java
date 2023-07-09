package matrix;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static boolean isValidSudoku(char[][] board) {
        Set container = new HashSet(){
        };
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]!='.'){
                    if (!container.add("row" + i+ board[i][j]) || !container.add("col" + j+ board[i][j])) {
                        return false;
                    }
                    if (!container.add("box" + (((i/3)*3)+(j/3))+ board[i][j]) ) {
                        return false;
                    }


                }

            }
        }
        return true;
    }
}
public class Soduko {
    public static void main(String[] args) {
        char[][] board =
                {         {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
//        System.out.println(board.length)'
        System.out.println(Solution.isValidSudoku(board));
    }
}
