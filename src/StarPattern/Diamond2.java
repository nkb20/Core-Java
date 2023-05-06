package StarPattern;

public class Diamond2 {

    public static void main(String[] args){

        int i,j,row=5;
        for (i=0;i<row;i++){
            for (j=0;j<row-i-1;j++){
                System.out.print("  ");
            }
            for(j=0;j<=i*2;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i=0;i<row-1;i++){
            for (j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(j=0;j<=2*(row-(2+i));j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
