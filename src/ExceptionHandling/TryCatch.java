package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a = 8;
        try {
            int b = a / 0;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println("Cant divide by zero");
        }
    }
}
