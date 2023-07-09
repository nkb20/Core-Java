package DSA.Sorting.minHeap;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[7];
        array[0] = 30;
        array[1] = 35;
        array[2] = 40;
        array[3] = 10;
        array[4] = 19;
        array[5] = 35;
        array[6] = 39;
        int n = array.length;

        System.out.println("MaxHeap");
        Heap.BuildHeap(array, n);
//        Arrays.stream(array).forEach(x-> System.out.println(x+" "));
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("\nMin value is= ");
        System.out.println(array[0]);

        System.out.print("Sorting elements= ");
        Array.HeapMinSort(array);

//        Heap.BuildHeap(array,n);
        System.out.print("\nArray after removing element: ");
        Array.HeapRemove(array, 0);


    }
}
