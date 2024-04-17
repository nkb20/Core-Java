package CollectionFramework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//HashSet
public class HS {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number of students for Roll no.");
        int std=scn.nextInt();

        HashSet<Integer> number=new HashSet<>();
        System.out.println("Enter roll no.");

        for (int i=0;i<std;i++){
             int n= scn.nextInt();
             number.add(n);
        }
        System.out.print("Roll number of "+std+" students are: ");
//        for (int i: number){
//            System.out.print(i+", ");
//        }

        //Iterator
        Iterator it=  number.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
