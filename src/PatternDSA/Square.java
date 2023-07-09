package PatternDSA;

public class Square {
    public static void main(String[] args) {
//        int i,j;
//        for(i=1;i<=n;i++){
//            for(j=1;j<=n;j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        row(1,6);
    }
    public static void row(int i,int n){
        if(i<=n){
            col(1,n);
            System.out.println();
            row(i+1,n);
        }
    }
    public static void col(int j,int n){
        if(j<=n){
            System.out.print("* ");
            col(j+1, n);
        }
    }
}
