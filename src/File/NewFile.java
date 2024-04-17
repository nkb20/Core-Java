package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewFile {

    public static void main(String[] args) {
        try {
            File file = new File("test.txt");

            if (file.createNewFile()) {
                System.out.println("File created :" + file.getName());
            } else System.out.println("file already exists");

            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("Aftab khan");
            fileWriter.close();

            File n=new File("test.txt");
            Scanner scn=new Scanner(n);
            while (scn.hasNextLine()){
                System.out.println(scn.nextLine());
            }

            FileWriter d = new FileWriter("test.txt",true);
            d.write("HUm");
            d.close();


        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }


    }

}
