package Interfaces;

class implementsClass implements firstInterface,secondInterface {


    @Override
    public void myMethod() {
        System.out.println("dd");

    }

    @Override
    public void myMethod2() {
        System.out.println("sdswda");

    }
}

class Main{

    public static void main(String[] args) {
        implementsClass myclass=new implementsClass();
        myclass.myMethod();
        myclass.myMethod2();

    }
}
