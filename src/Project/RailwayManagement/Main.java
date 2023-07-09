package Project.RailwayManagement;

import Project.RailwayManagement.Passengers.Passenger;
import Project.RailwayManagement.Service.Methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static List<Passenger> passengerList = new ArrayList<>();
//
//    public  static void addPassenger(Passenger passenger) {
//        passengerList.add(passenger);
//        System.out.println("Passenger Added ");
//    }
//
//    public void getPassById(int Id) {
//        for (Passenger passenger : passengerList) {
//
//            if (passenger.getId() == Id) {
//                System.out.println(passenger.getId() + " " + passenger.getName());
//            }
//        }
//    }
//
//
//    public void showAllPass () {
//        for (Passenger passenger : passengerList) {
//            System.out.println(passenger.getId() + " " + passenger.getName() + " " + passenger.getName() + " " + passenger.getBoarding()
//                    + " " + passenger.getDestination() + " " + passenger.getMobile());
//        }
//
//    }
//
//    public void removePassById ( int Id){
//        for (Passenger passenger : passengerList) {
//            if (passenger.getId() == Id) {
//                passengerList.remove(passenger);
//            }
//            showAllPass();
//        }
//    }
//
//    public void removeAllPass () {
//        passengerList.removeAll(passengerList);
//        System.out.println("Passnergs removed succesfully");
//    }

    public static void main(String[] args) {
Methods met=new Methods();
//        List<Passenger> passenge = new ArrayList<>();

        Passenger passenger1=new Passenger(21,"Aftab",9845826,"LTE","Allahabad");
        Passenger passenger2=new Passenger(22,"John",96626,"LTE","Allahabad");
        Passenger passenger3=new Passenger(23,"Sumit",85245826,"LTE","Allahabad");
        Passenger passenger4=new Passenger(24,"Adnan",56325826,"LTE","Allahabad");

met.addPassenger(passenger1);
        met.addPassenger(passenger2);
        met.addPassenger(passenger3);
        met.addPassenger(passenger4);

        met.getPassById(23);

        met.showAllPass();
        System.out.println();
        met.removePassById(23);
        System.out.println();

        met.removeAllPass();
        System.out.println(met.passengerList);





//    addPassenger(passenger1);

    }
}
