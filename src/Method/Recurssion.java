package Method;

public class Recurssion {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 number is: "+sum(5));
        System.out.println(sum(10,4));

    }

    static int sum(int start,int end){
        if (start<=end){
            return end;
        }
        else{
            return start+ sum(start-1,end);
        }

    }
    
    
    static int sum(int a) {

        if (a <= 0) {
            return 1;
        } else if (a > 0) {
            return a + sum(a - 1);

        }
        else return 0;
    }
}
