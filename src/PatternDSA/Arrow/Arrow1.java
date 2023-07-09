package PatternDSA.Arrow;

public class Arrow1 {

    public static void star(int j,int i){
if (j<=i){
            System.out.print("*");
        star(j+1,i)    ;

        }}

    public void ArrowMethod(int i, int n) {
        if (i <= n) {
            col(1,n,i);
            star(1,i);

            System.out.println();
            ArrowMethod(i + 1, n);

        }
    }

    public void col(int j, int n, int i) {
        if (j <= ((n * 2) - (2 * i))) {

            System.out.print(" ");
            col(j+1,n,i);

        }
    }


}
