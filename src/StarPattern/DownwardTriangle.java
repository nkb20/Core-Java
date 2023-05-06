package StarPattern;

public class DownwardTriangle {
    public static void main (String[] args){

        int i,j;
        short row=7;
        for(i=0;i<row;i++){
            for(j=0;j<row-i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }

    }

}
