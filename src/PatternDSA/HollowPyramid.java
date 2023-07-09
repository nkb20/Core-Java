package PatternDSA;

public class HollowPyramid {

    public static void main(String[] args) {
        int i, j;

//        for(i=1;i<=5;i++){
//
//            for(j=1;j<=5-i;j++){
//                System.out.print("  ");
//            }
//
//            for (j=1;j<=i;j++){
//                if(j==1|| j==i||i==5)
//                System.out.print("*   ");
//                else
//                    System.out.print("    ");
//            }
//            System.out.println();
//        }
        row(1, 5);
    }

    public static void row(int i, int n) {

        if (i <= n) {
            space(1, n, i);
            col(1, i, n);
            System.out.println();
            row(i + 1, n);
        }
    }

    public static void space(int j, int n, int i) {
        if (j <= (n - i)) {
            System.out.print("  ");
            space(j + 1, n, i);
        }
    }

    public static void col(int k, int i, int n) {
        if (k <= i) {
            if (k == 1 || k == i || i == n) {
                System.out.print("*   ");

            } else {
                System.out.print("    ");
            }
            col(k + 1, i, n);
        }

    }


}
