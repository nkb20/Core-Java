package StarPattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        System.out.println("Enter a row");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int i,n=1,j,k;
        for (i=0;i<row;i++){

            for(j=2*(row-i);j>1;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            for (j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for (i=0;i<row-1;i++){

            for(j=0;j<n+2;j++){
                System.out.print(" ");

            }
            n=n+2;
            for(j=0;j<row-i-1;j++){
                System.out.print("* ");
            }
            for (j=0;j<row-2-i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
