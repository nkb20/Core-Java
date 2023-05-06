package abstraction;

abstract class Animal {
    public abstract void animalSound();
}

class dog extends Animal{
    public void animalSound(){
        System.out.println("bark");
    }

}
class Main{

    public static void main(String[] args) {
        dog mydog=new dog();
        mydog.animalSound();

    }
}
