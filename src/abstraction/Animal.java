package abstraction;

abstract class Animal {
    public abstract void animalSound();
    public void name(){
        System.out.println("Aftab khan");
    }
}

class dog extends Animal {
    public void animalSound() {
        System.out.println("bark");
    }

}

class Main {

    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.animalSound();
        mydog.name();

    }
}
