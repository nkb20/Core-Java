package matrix;

import DSA.Sorting.minHeap.Array;

import java.util.Arrays;

public class MatrixSize {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 5, 4},
                {5, 9, 8}
        };

        int[][] matrix2;
        matrix2 = new int[][]{
                {2, 3,8},
                {5, 9,5},
                {5, 9,0},
        };

        System.out.println("Matrix size " + matrix[1].length);

//        Printing row and column using to String
        for (int [] row: matrix) {
            System.out.println(Arrays.toString(row));
        }

        //Printing row and column using for each loop
        for(int [] row: matrix2){
            for(int col:row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }



    }


}
