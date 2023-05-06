package Method;

public class MethodOverloading {

    static int addMethod(int x,int y){
        return x+y;
    }
    static float addMethod(float a,float b){
        return a-b;
    }
    public static void main(String[] args) {
        System.out.println(addMethod(5,5));
        System.out.println(addMethod(5.5f,1.0f));

    }
}
