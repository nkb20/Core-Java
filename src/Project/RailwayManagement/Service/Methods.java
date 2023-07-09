package Project.RailwayManagement.Service;

import Project.RailwayManagement.Passengers.Passenger;

import java.util.ArrayList;
import java.util.List;

public class Methods implements PassInterface {
    public List<Passenger> passengerList = new ArrayList<>();

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
        System.out.println("Passenger Added ");

    }

    public void getPassById(int Id) {
        for (Passenger passenger : passengerList) {

            if (passenger.getId() == Id) {
                System.out.println(passenger.getId() + " " + passenger.getName());
            }
        }
    }


        public void showAllPass () {
            for (Passenger passenger : passengerList) {
                System.out.println(passenger.getId() + " " + passenger.getName() + " " + passenger.getName() + " " + passenger.getBoarding()
                        + " " + passenger.getDestination() + " " + passenger.getMobile());
            }

        }

        public void removePassById ( int Id){
            for (Passenger passenger : passengerList) {
                if (passenger.getId() == Id) {
                    passengerList.remove(passenger);
                }

            }showAllPass();
        }

        public void removeAllPass () {
            passengerList.removeAll(passengerList);
            System.out.println("Passnergs removed succesfully");
        }


}
