package File;

import java.io.File;
import java.io.IOException;

public class delete {

    public static void main(String[] args) {

        try{
            File file=new File("newFile1.txt");
            if(file.delete()){
                System.out.println("file deleted succesfully");
            }
            else System.out.println("file doesnt exist");


        }catch (Exception e){

            System.out.println("an error occured");
        }
    }
}
