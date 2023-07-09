package DSA.Sorting.minHeap;

public class Heap {

    public static void BuildHeap(int[] array, int n) {

        for (int i = (n - 2) / 2; i >= 0; i--) {
            Heapify(array, n, i);
        }
    }

    public static void Heapify(int[] array, int n, int i) {

        int parent = i;
        int left_node = parent * 2 + 1;
        int right_node = parent * 2 + 2;

        if (left_node < n && array[left_node] < array[parent]) {

            parent = left_node;
        }
        if (right_node < n && array[right_node] < array[parent]) {

            parent = right_node;
        }
        if (i != parent) {
            Swap(array, parent, i);
            Heapify(array,n,parent);
        }
    }

    public static void Swap(int[] array, int parent, int j) {

        int temp = array[j];
        array[j] = array[parent];
        array[parent] = temp;
    }
}
