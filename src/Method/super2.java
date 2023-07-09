package Method;


class normalCal extends Object {
    normalCal() {
        super();
        System.out.println("Normal Cal");
    }
    normalCal(int a) {
        super();
        System.out.println("Normal Cal a");
    }
}

class advanceCal extends normalCal {
    advanceCal(){
        super();
        System.out.println("Advance call");
    }
    advanceCal(int b){
        this();

        System.out.println("Advance call b");
    }
}

public class super2 {
    public static void main(String[] args) {

        advanceCal obj = new advanceCal(5);

    }
}
