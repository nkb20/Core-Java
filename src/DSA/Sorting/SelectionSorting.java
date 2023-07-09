package DSA.Sorting;

public class SelectionSorting {
    public static void SelectionSort(int[] arr) {

        for (int i = 0; i < (arr.length - 1); i++) {
            int smallest=i;
            for(int j=i+1;j<(arr.length);j++){


                if(arr[smallest]>arr[j]) {
                    smallest = j;

                }

                }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

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
        arr[4] = 5;
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        SelectionSort(arr);


    }
}
