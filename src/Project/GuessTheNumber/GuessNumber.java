package Project.GuessTheNumber;

import java.beans.ConstructorProperties;
import java.util.*;

public class GuessNumber implements Methods {

    public List<Integer> score = new ArrayList<Integer>();
    Scanner scn = new Scanner(System.in);
    private int a, count;
    private String userName;

    GuessNumber(String userName) {
        this.userName = userName;
    }

    public int number() {
        a = (1+(int) (Math.random() * 100));
        return a;
    }

    @Override
    public void game() {
        System.out.println("\n//////////<<<Welcome to the PlayStation>>>//////////\n");
//        GuessNumber obj = new GuessNumber();
        boolean t = true;
        int random = number();
        System.out.print("Guess the  number between 1 to 100: ");

        count = 1;

        do {
            //15
            int a = scn.nextInt();
//            System.out.println("Random number is " + random+"\n");
            //9


            if (random == a) {
                System.out.println("\nCONGRATULATIONS!!!" +
                        " You have selected the correct numbber in " + (count) + " attem○pt.\n");

                score.add(count);

                boolean innerBreak = true;

                while (innerBreak) {

                    System.out.print("\nPlease Select One Option>>>\n1.Continue\n2.Main Menu\nType here...\t");
                    int con = scn.nextInt();
                    if (con == 1 || con == 2) {
                        switch (con) {
                            case 1: {
                                count = 1;
                                System.out.print("\nGuess the  Number between 1 to 100: ");
                                random = number();
                                innerBreak = false;
                                break;
                            }
                            case 2: {
                                Menu();
                                innerBreak = false;
                                t = false;


                            }

                        }
                    } else {
                        System.out.println("Select correct option:");

                    }

                }

            }
            else if (a <= random && a <= 10 && a > 0 && random <= 10 && random >= 1) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a < random && a < 20 && a > 10 && random <= 20 && random > 10) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a >= random && a < 10 && a >= 0 && random <= 10 && random >= 0) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }
            else if (a > random && a < 20 && a > 10 && random < 20 && random > 10) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }


            else if (a <= random && a <= 30 && a > 20 && random <= 30 && random >= 20) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a < random && a < 40 && a > 30 && random <= 40 && random > 30) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a >= random && a < 30 && a >= 20 && random <= 30 && random >= 20) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }
            else if (a > random && a < 40 && a > 30 && random < 40 && random > 30) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }


            else if (a <= random && a <= 50 && a > 40 && random <= 50 && random >= 40) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a < random && a < 60 && a > 50 && random <= 60 && random > 50) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a >= random && a < 50 && a >= 40 && random <= 50 && random >= 40) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }
            else if (a > random && a < 60 && a > 50 && random < 60 && random > 50) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }


            else if (a <= random && a <= 70 && a > 60 && random <= 70 && random >= 60) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a < random && a < 80 && a > 70 && random <= 80 && random > 70) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a >= random && a < 70 && a >= 60 && random <= 70 && random >= 60) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }
            else if (a > random && a < 80 && a > 60 && random < 80 && random > 60) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }


            else if (a <= random && a <= 90 && a > 80 && random <= 90 && random >= 80) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a < random && a < 100 && a > 90 && random <= 100 && random > 90) {
                System.out.print("You are too close, Enter greater Number: ");
                count++;
            } else if (a >= random && a < 90 && a >= 80 && random <= 90 && random >= 80) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }
            else if (a > random && a < 100 && a > 90 && random < 100 && random > 90) {
                System.out.print("You are too close, Enter Smaller Number: ");
                count++;
            }

            else if (a < random) {
                System.out.print("Number is too small, Enter Greater Number: ");
                count++;

            } else if (a > random) {
                System.out.print("Number is too Big, Enter Smaller Number: ");
                count++;
            }
//            else System.out.println("Enter a number");
        }
        while (t);

    }

    @Override
    public void usersScore() {

        System.out.println("\nHello " + userName.toUpperCase() + "!! Welcome to MY PLAYSTATION ");
        boolean t = true;

        while (t) {
            System.out.print("\nSelect any one Option: \n1.Last Score\n" +
                    "2.High Score\n3.Lowest Score\n4.Main Menu\nType here...");

            a = scn.nextInt();
            if (a == 1 || a == 2 || a == 3 || a == 4) {
                switch (a) {
                    case 1:
                        int size = score.size();
                        System.out.println("\nYour Last score is: " + score.get(size-1));
                        continue;
                    case 2:
                        Collections.sort(score);
                        System.out.println("\nHighest score is: " + score.get(0));
                        continue;
                    case 3:
                        Collections.sort(score, Collections.reverseOrder());

                        System.out.println("\nLowest score is: " + score.get(0));
                        continue;
                    case 4:
                        Menu();
                        t = false;
                        break;

                }

            }
        }

    }

    public void Menu() {

        System.out.print("\nSelect One option. \n1.Play \n2.Score \n3.Exit\nType here...");
        boolean tr = true;
        while (tr) {
            a = scn.nextInt();

            if (a == 1 || a == 2 || a == 3) {
                switch (a) {

                    case 1:
                        game();
                    case 2:
                        usersScore();

                    case 3:
                        tr = false;
                        break;

                }
            } else
                System.out.println("\nSelect One option. \n1.Play \n2.Score \n3.Exit \nType here...");

        }


    }

}



