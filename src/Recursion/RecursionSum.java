package Recursion;

public class RecursionSum {

public static int sum(int n){
//int sum=0;
    if (n>0){
        return  n+ sum(n-1);

    }
    return 0;


}
    public static void main(String[] args) {

        int a=sum(5);
        System.out.println("Sum is "+a);
    }
}
