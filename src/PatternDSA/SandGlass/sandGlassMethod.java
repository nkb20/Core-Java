package PatternDSA.SandGlass;

public class sandGlassMethod {

    public static final int i;

    static {
        i = 200;
//        n=5;
    }

    public  int n ; //5
    sandGlassMethod(int n) {
        this.n = n;
    }

    public static void row(int i, int n) {
        if (i <= n) {
            space(1, i);
            star(1, n, i);
            System.out.println();
            row(i + 1, n);
        }
    }

    //Aftab(1);
    public static void space(int j, int i) {
        if (j < i) {
            System.out.print(" ");
            space(j + 1, i);
        }

    }

    public static void star(int j, int n, int i) {
        if (j <= (n - i + 1)) {
            System.out.print("* ");
            star(j + 1, n, i);
        }

    }

    public static void space1(int i, int n) {
        if (n > (i + 1)) {
            System.out.print(" ");
            space1(i, n - 1);
        }
    }
    //priting lower star

public void test(sandGlassMethod obj){
    System.out.println("Value of n is: "+obj.n+" \nValue of i is: "+obj.i);

}

    public void row1(int i, int n) {
        if (i < n) {
            space1(i, n);
            star1(1, n, i);
            System.out.println();
            row1(i + 1, n);
        }
    }

    public void star1(int j, int n, int i) {
        if (j <= (i + 1)) {
            System.out.print("* ");
            star1(j + 1, n, i);
        }

    }


}
