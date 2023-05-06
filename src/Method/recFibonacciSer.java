package Method;

public class recFibonacciSer {

    static int fibonacciRec(int count){

        if (count==1 || count==2 ){
            return 1;
        }
        else{
            return (fibonacciRec(count-1)+fibonacciRec(count-2));
        }

    }

    public static void main(String[] arg){
//        System.out.print("0 1 ");
//        fibonacciRec(5)
        int count=5;
//        System.out.println(fibonacciRec(count));
        for (int i=1;i<=count;i++)    {
            System.out.print(fibonacciRec(i)+" ");
        }
        int a=0,b=1,c;
        System.out.println();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=0;i<count-2;i++){
            c=a+b;

            System.out.print(c+" ");
            a=b;
            b=c;

        }

    }
}
