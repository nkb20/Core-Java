package Introduction;

public class IfEls {
    public static void main(String[] args){

        final int a=20;
        if (a>10){
            System.out.println("Number is greater than 10");
        }
        else if (a<30) {
            System.out.println("Number is less than 30");
        }
        else {
            System.out.println("Hello");

        }

        String rslt = (a==20)? "Number is equal to 20": "Number is not equal to 20";
        System.out.println(rslt);

    }
}
