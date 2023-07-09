package PatternDSA.UniquePAttern;

public class main {
    public static void design(int n) {
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
            if(i==j || i+j==(n+1)){
                if(i==j){
                    System.out.print("\\");
                }
                else System.out.print("/");

            }
            else System.out.print("*");

            }


            System.out.println();
        }


    }

    public static void main(String[] args) {
        design(9);

    }
}
