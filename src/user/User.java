package user;

public class User {
    public int no;
    public String name;

    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
