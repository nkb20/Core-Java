package Project.RailwayManagement.Service;

import Project.RailwayManagement.Passengers.Passenger;

public interface PassInterface {
    public  void addPassenger(Passenger pass);
    public  void getPassById(int Id);
    public  void showAllPass();

    public void removePassById(int Id);

    public void removeAllPass();
}
