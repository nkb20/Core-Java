package matrix;

import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int minrow = 0;
        int mincol = 0;
        int maxrow = matrix.length - 1;
        int maxcol = matrix[0].length - 1;

        //For loop for adding first row into list
        while(minrow<=maxrow && mincol<=maxcol){
            for (int i = mincol; i <= maxcol; i++) {
                list.add(matrix[minrow][i]);
            }

            minrow++;

            //for loop for adding last col into list
            for (int i = minrow; i <= maxrow; i++) {
                list.add(matrix[i][maxcol]);
            }
            maxcol--;


            //for loop for adding last row into list
            if(minrow<=maxrow){
                for (int i = maxcol; i >= mincol; i--) {
                    list.add(matrix[maxrow][i]);
                }
            }

            maxrow--;

            if(mincol<=maxcol){
                for (int i = maxrow; i >minrow; i--){
                    list.add(matrix[i][mincol]);
                }
            }
            mincol++;
        }

        return list;
    }
}

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
//        Solution1.spiralOrder(matrix);
        System.out.println(Solution1.spiralOrder(matrix));
    }
}
