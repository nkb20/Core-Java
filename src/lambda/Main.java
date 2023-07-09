package lambda;

@FunctionalInterface
interface A {
    int addition(int a, int b);
}
public class Main {

    public static void main(String[] args) {
//        Normal Expresson
//        A obj=new A()
//        {
//        public void addition(int a,int b){
//            System.out.println(a+b);
//        }
//        };
//        Lambda Expression

        A obj = (a, b) -> a+b;

        int result=obj.addition(5, 6);
        System.out.println(result);


    }
}