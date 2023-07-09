package Recursion;

public class RecursionFibonacci {
    static int a=0;
    static int b=1;
    public static void fibo(int n) {
        int c=a+b;
        if(n>2){

            System.out.print(" "+c);
            a=b;
            b=c;
            fibo(n-1);
        }





    }

    public static void main(String[] args) {
        System.out.print(a+" "+b);
        fibo(7);

    }
}
