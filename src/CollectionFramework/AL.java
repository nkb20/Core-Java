package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AL {

    public static void main(String[] args) {
        // Fast for accesing an element -- Time Comlexity =O(1)
        //Slow for removing an element--- Time Comlexity =O(n)

        ArrayList<Integer> data=new ArrayList<Integer>();

        data.add(5);
        data.add(4);
        data.add(3);
        data.add(5);
        data.add(2);
        data.add(1);

        data.add(50);

        System.out.println("Iterator");
        Iterator it=data.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println("Elements "+ data);

        data.remove(2);
        data.add(2,10);
        System.out.println("New data: "+data);

        data.set(3,5);
        System.out.println("New data: "+data);

        for(int i:data){
            System.out.print(i+" ");

        }
        System.out.println();
        int d=data.get(4);
        System.out.println("Access an ALement "+d);

        System.out.println("Size of ArrayList " +data.size());

        Collections.sort(data);
        System.out.println("Sorted array "+data);

        data.clear();
        System.out.println("Empty ArrayList "+data);
    }
}
