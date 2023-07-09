package Method;

class A{
    public int add(int a ,int b){
        return a+b;
    }

}
class B extends A{
    @Override
    public int add(int a ,int b){
        return a+b+5;
    }

}

public class methodOverriding {
    public static void main(String[] args) {
        B obj =new B();
        System.out.println(obj.add(5,5));
    }
}

