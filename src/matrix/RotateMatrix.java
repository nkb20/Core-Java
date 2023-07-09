package matrix;

import java.util.Arrays;

class Solution2 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i< matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int swap=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=swap;
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< (matrix.length-1)/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1-j];
                matrix[i][matrix.length - 1-j]=temp;
            }
        }
        for(int[] mat:matrix){
            System.out.println(Arrays.toString(mat));
        }
    }
}

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Solution2.rotate(matrix);
    }
}
