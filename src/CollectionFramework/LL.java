package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LL {


    public static void main(String[] args) {
        // Fast for adding an element TC==0(1)
        //Accesing an alement is Slow TC==O(n)

        LinkedList<Integer> oj= new LinkedList<Integer>();
        oj.add(5);
        oj.add(2);
        oj.add(7);

        System.out.println(oj);

        oj.addFirst(9);
        oj.addLast(99);
        System.out.println(oj);

        oj.set(2,5);
        System.out.println(oj);

        Collections.sort(oj);
        System.out.println(oj);




        System.out.println(oj.getFirst());
        System.out.println(oj.getLast());
        System.out.println(oj.get(3));


        oj.removeFirst();
        oj.removeLast();
        oj.remove(2);
        System.out.println(oj);


        oj.clear();
        System.out.println(oj);

    }

}
