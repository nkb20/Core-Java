package DSA.Sorting.maxHeap;

public class Array {

    public static void HeapSort(int[] array, int n) {

        MaxHeap.BuildHeap(array, array.length);

        for (int i = n - 1; i >= 0; i--) {
            MaxHeap.swap(array, 0, i);
            MaxHeap.Heapify(array, i, 0);
        }

        System.out.println("\nSort= ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void HeapRemove(int[] array, int n, int index) {
        MaxHeap.BuildHeap(array, n);
        int temp = array[index];
        array[index] = array[n-1];
        array[n-1] = temp;
        n = n - 1;

        MaxHeap.BuildHeap(array, n);
        System.out.println("\nArray After removing element  ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
