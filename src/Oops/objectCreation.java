package Oops;

public class objectCreation {

public objectCreation(int x){   //constructor
    System.out.println("x is "+x);
}
//    String fNAme="Aftab";

    public static void main(String[] args) {
        objectCreation myobect=new objectCreation(5);

    Vehicle myObj=new Vehicle();

        System.out.println(myObj.carEngine("4stroke "));
        System.out.println(myObj.carSpeed(120));

    }
}
