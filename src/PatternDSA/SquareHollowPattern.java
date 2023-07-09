package PatternDSA;

import java.util.Scanner;

/* ************
 *          *
 *          *
 ************ */
public class SquareHollowPattern {
    public static void main(String[] args) {

//        int n = 7;
//        int i, j;
//
//        for (i = 1; i <= n; i++) {
//
//            for (j = 1; j <= n; j++) {
//                if (j == 1 || j == n || i == 1 || i == n) {
//                    System.out.print("* ");
//
//                }
//                else System.out.print("  ");
//
//            }
//            System.out.println();
//
//
//        }

        row(1,4);
    }
    public static void row(int i,int n ){

        if (i<=n){
            col(1,n,i);
            System.out.println();
            row(i+1,n);

        }

    }
    public static void col(int j,int n,int i){

        if(j<=n){
            if(i==1||i==n||j==1||j==n){
                System.out.print("*  ");
//                col(j+1,n,i);
            }
            else{
                System.out.print("   ");
//                col(j+1,n,i);
            }
            col(j+1,n,i);

        }


    }
}
