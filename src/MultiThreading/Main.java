package MultiThreading;

// Using extends thread
class M1 extends Thread {
    @Override
    public  void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am good");
            i++;
        }
    }
}

class M2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am not good");
            i++;
        }
    }
}

class Main {
    public static void main(String[] args) {

        M1 thread1 = new M1();
        M2 thread2 = new M2();

        thread1.start();
        thread2.start();


    }
}

