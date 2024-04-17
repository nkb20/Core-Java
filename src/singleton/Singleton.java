package singleton;

public class Singleton {

    private static Singleton single_instance=null;
    private String name;
    private Singleton(String name){
        this.name=name;
    }

    public static Singleton getInstance(String name){

        if(single_instance==null){
            single_instance= new Singleton(name);
        }
        return single_instance;
    }

    @Override
    public String toString() {
        return name;
    }
}

