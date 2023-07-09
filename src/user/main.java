package user;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<User> user1 = new ArrayList<>();
//User user1=new User()
        user1.add(new User(23,"Aftab"));
        user1.add(new User(24,"Altaf"));

        System.out.println(user1);
    }
}

