package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("newf.txt");
obj.write("This is first text file i wrote in java");
        obj.close();
            System.out.println("Successfully wrote the file ");


        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
