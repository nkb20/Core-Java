package DSA.Sorting.maxHeap;

public class MaxHeap {

    public static void BuildHeap(int[] array, int n) {
        for (int i = (n-2)/2; i >=0; i--) {
            Heapify(array, n, i);
        }
    }

    public static void Heapify(int[] array, int n, int i) {
        int parent = i;
        int left_node = 2 * parent+1 ;
        int right_node = 2 * parent+2;

        if (left_node < n && array[left_node] > array[parent]) {
            parent = left_node;
        }
        if (right_node < n && array[right_node] > array[parent]) {
            parent = right_node;
        }

        if (parent != i){
            swap(array,i ,parent);
            Heapify(array,n,parent);
        }

    }
    public static void swap(int[] array,int i,int parent){
        int temp=array[parent];
        array[parent]=array[i];
        array[i]=temp;

    }
}
