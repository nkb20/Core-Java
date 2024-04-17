package singleton;

public class main {

    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance("Aftab");
        Singleton singleton1=Singleton.getInstance("khan");// this won't work

        System.out.println(singleton.toString());
        System.out.println(singleton1.toString());  // this won't work


    }
}
