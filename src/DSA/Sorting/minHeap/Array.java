package DSA.Sorting.minHeap;

import java.util.Arrays;

public class Array {

    public static void HeapMinSort(int[] array) {
        int n = array.length;
        Heap.BuildHeap(array, n);

        for (int i = n - 1; i >= 0; i--) {
            Heap.Swap(array, i, 0);
            Heap.Heapify(array, i, 0);
        }

        Arrays.stream(array).forEach(x -> System.out.print(x + " "));

    }

    public static void HeapRemove(int[] array, int j) {

        int n = array.length;
        Heap.BuildHeap(array,n);
        Heap.Swap(array,n-1,0);

        n=n-1;
        Heap.BuildHeap(array,n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
