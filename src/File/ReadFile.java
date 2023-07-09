package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
try {
    File myFile = new File("newf.txt");

    Scanner read = new Scanner(myFile);
    while (read.hasNextLine()) {
        String data = read.nextLine();
        System.out.println(data);

    }
    read.close();
}catch (IOException e){
    System.out.println("file does not exist");


}
    }
}
