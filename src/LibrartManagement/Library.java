package LibrartManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Library {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Details bookDetails=new Details();
        System.out.println("Welcome to \"Our\" Library: ");
        int input;
        do{

            System.out.println("1. Add book");
            System.out.println("2. Show all Books");
            System.out.println("3. Show available Books");
            System.out.println("4. Borrow book");
            System.out.println("5. Return book");
            System.out.println("6. Exit");
            input= in.nextInt();

            if (input>6){
                System.out.println("Select correct Option from 1-6 \n");
            }
            else{

                switch(input){
                    case 1:
                        bookDetails.addBook();
                        System.out.println(bookDetails.addBook());
                        break;
                    case 2:
                        bookDetails.showAllBook();
                        break;
                    case 3:
                        bookDetails.showAvailableBook();
                        break;
                    case 4:
                        bookDetails.borrowBook();
                        break;
                    case 5:
                        bookDetails.returnBook();
                        break;
                    case 6:
                        break;
                }
            }



        }
        while(input!=6);

    }

}
