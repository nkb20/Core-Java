package DSA.Sorting.maxHeap;

public class Heap {
    public static void main(String[] args) {
        int max = 20;
        int[] array = new int[max];
        array[0] = 25;
        array[1] = 18;
        array[2] = 20;
        array[3] = 25;
        array[4] = 15;
        array[5] = 10;
        array[6] = 30;

        int n = 7;

        // Calling Max Heap Method
        MaxHeap.BuildHeap(array, array.length);
        System.out.println("Max Heapify= ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        Array.HeapSort(array, n);



        Array.HeapRemove(array,n,0);

    }
}
