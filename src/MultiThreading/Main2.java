package MultiThreading;

//Thread by Implements
class Main4 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am not good 1");
            i++;
        }
    }


}

class Main3 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am not good 2");
            i++;
        }
    }
}
class main2 {
    public static void main(String[] args) {

        Main3 m3=new Main3();
        Main4 m4=new Main4();
    Thread thread3=new Thread(m3);
        Thread thread4=new Thread(m4);
        thread3.start();
        thread4.start();

    }

}
