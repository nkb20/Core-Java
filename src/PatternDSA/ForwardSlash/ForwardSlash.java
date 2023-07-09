package PatternDSA.ForwardSlash;

import java.util.Scanner;

public class ForwardSlash {


    static void slash(int i, int n) {
        if (i <= n) {
            space(1, i, n);
            star(1, i);
            System.out.println();
            slash(i + 1, n);
        }

    }

    static void space(int j, int i, int n) {
        if (j < (n - i + 1)) {

            System.out.print("  ");
            space(j + 1, i, n);

        }

    }

    static void star(int j, int i) {
        if (j <= i) {
            if (j == i) {
                System.out.print("*");
            } else star(j + 1, i);
        }
    }

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        int n = scn.nextInt();

        slash(1, n);
//        int a;
        while (true) {
            System.out.println("Do you want to continue??\n1.Yes\n2.No");
            int a = scn.nextInt();

            switch (a) {
                case 1: {
                    System.out.print("Enter number of line: ");
                    int b = scn.nextInt();
                    slash(1, b);
                    continue;
                }
                case 2: {
                    System.out.println("The programme is ended.");
                    break;
                }
                default: {
                    System.out.println("please select correct option.");
                    continue;
                }

            }
break;

        }
    }
}
