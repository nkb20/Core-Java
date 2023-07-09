package File;
import java.io.File;
import java.io.IOException;

public class NewFile {

    public static void main(String[] args) {
        try {
            File obj = new File("newFile.txt");

            File obj1 = new File("newFile1.txt");
            obj1.createNewFile();

            if(obj.createNewFile()){
                System.out.println("File created :"+obj.getName());
            }
            else System.out.println("file already exists");

        }catch (IOException e)
        {
            System.out.println("an error occurred");
            e.printStackTrace();
        }



    }

}
