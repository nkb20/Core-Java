package StarPattern;

import java.util.Scanner;

public class Star {
    public static void main(String[] args){

        int row=4;
        System.out.println("Enter number of row");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();

        for (int j=1;j<=row;j++){
            for (int i=row-j; i>=1; i--) {
                System.out.print(" ");
            }
for (int k=1;k<=j;k++){
    System.out.print("* ");
}

        System.out.println();
        }


    }
}
