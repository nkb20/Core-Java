package Recursion;

class R {

    public void star(int i, int n) {
        if (i <= n) {
            newStar(1,i,n);
            System.out.println();
            star(i=i+1,n);
        }
    }
    public void newStar(int j,int i,int n){
        if(j<=i){
            System.out.print("*");
            newStar(j=j+1,i,n);
        }
    }


}

public class recursionpractice {
    public static void main(String[] args) {
        R obj = new R();
        obj.star(1, 5);

    }
}
