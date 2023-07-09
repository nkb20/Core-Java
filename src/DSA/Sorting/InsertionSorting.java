package DSA.Sorting;

public class InsertionSorting {



    public static void InsertionSort(int[] arr) {

        for (int i = 1; i < arr.length ; i++) {

            int current =arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;

            }

            arr[j+1]=current;

        }


        System.out.print("Asscendind order: ");
        for(int array:arr){
            System.out.print(array+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 12;
        arr[1] = 9;
        arr[2] = 8;
        arr[3] = 7;
        arr[4] = 15;
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

       InsertionSort(arr);

    }
}
