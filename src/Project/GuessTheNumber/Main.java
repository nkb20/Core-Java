package Project.GuessTheNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter your LOVELY Name: ");
        String userName=scn.nextLine();

        GuessNumber obj= new GuessNumber(userName);

//        obj.usersScore();
//        int menu =scn.nextInt();
        obj.game();


    }
}
