package PatternDSA.HollowDiamond;

public class Main {
    public static void main(String[] args) {

        int n = 8;
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n-i+1); j++) {
                System.out.print("* ");
            }
            for(j=1;j<i;j++){
                System.out.print("  ");
            }
            for(j=2;j<=i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for(j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(j=2;j<=(n-i+1);j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
