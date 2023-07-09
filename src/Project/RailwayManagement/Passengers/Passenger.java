package Project.RailwayManagement.Passengers;

public class Passenger {
    private int Id;
    private String Name;
    private long Mobile;
    private String Boarding;
    private String Destination;

    public Passenger(int id, String name, long mobile, String boarding, String destination) {
        Id = id;
        Name = name;
        Mobile = mobile;
        Boarding = boarding;
        Destination = destination;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getMobile() {
        return Mobile;
    }

    public void setMobile(long mobile) {
        Mobile = mobile;
    }

    public String getBoarding() {
        return Boarding;
    }

    public void setBoarding(String boarding) {
        Boarding = boarding;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Mobile=" + Mobile +
                ", Boarding='" + Boarding + '\'' +
                ", Destination='" + Destination + '\'' +
                '}';
    }
}
