package Recursion;

public class Recusionfactorial {
    public static int Factorial (int n){
        int fac=n;
        if(n!=0){

            return  fac * Factorial(n-1);

        }
else
        return 1;

    }
    public static void main(String[] args) {
        int n1=5;
        int fac1=Factorial(n1);
        System.out.println("Factorial of "+n1+ " is "+fac1);

    }
}
