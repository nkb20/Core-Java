package PatternDSA;

public class ButterFly_Star_Pattern {
    public static void main(String[] args) {
        int n = 15;
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if(i%2!=0&& j%2!=0){
                    System.out.print("* ");
                }
                else if (i%2!=0&& j%2==0) {
                    System.out.print("  ");
                }
                else if (i%2==0&& j%2==0){
                    System.out.print("* ");

                }
                else System.out.print("  ");
            }
            // space
            for(j=i;j<n;j++){

                System.out.print("  ");
            }
            for(j=i;j<n;j++){

                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                if(i%2!=0&& j%2!=0){
                    System.out.print("* ");
                }
                else if (i%2!=0&& j%2==0) {
                    System.out.print("  ");
                }
                else if (i%2==0&& j%2!=0){
                    System.out.print("* ");

                }
                else System.out.print("  ");
            }


            System.out.println();
        }


        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                if(i%2!=0 && j%2==0){
                    System.out.print("* ");
                }
                else if (i%2!=0&& j%2!=0) {
                    System.out.print("  ");
                }
                else if (i%2==0&& j%2==0){
                    System.out.print("* ");

                }
                else System.out.print("  ");
            }
            // space
            for(j=1;j<i;j++){

                System.out.print("  ");
            }
            for(j=1;j<i;j++){

                System.out.print("  ");
            }
            for (j = i; j <= n; j++) {
                if(i%2!=0&& j%2!=0){
                    System.out.print("  ");
                }
                else if (i%2!=0&& j%2==0) {
                    System.out.print("* ");
                }
                else if (i%2==0&& j%2==0){
                    System.out.print("  ");

                }
                else System.out.print("* ");
            }


            System.out.println();
        }
    }
}
