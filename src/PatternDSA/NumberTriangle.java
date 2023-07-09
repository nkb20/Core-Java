package PatternDSA;

public class NumberTriangle {

//    public static void NT(int n){
//
//        int i,j;
//        for(i=1;i<=n;i++){
//            for( j=n-i;j>0;j--){
//                System.out.print(" ");
//            }
//            for(j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        row(1,6);
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

    }
    public static void row(int i,int n){

        if(i<=n){
            space(i,n);
            col(1,i,n);
            System.out.println();
            row(i+1,n);

        }
    }
    public static void space(int i,int n){
        if(i<n){
            System.out.print(" ");
            space(i+1,n);
        }

    }
    public static void col(int j,int i,int n){
        if(j<=i){
//            space(i,n);
            System.out.print("* ");
            col(j+1,i,n);
        }
    }
}
