package DSA.Sorting;

public class BubbleSorting {
    public static void BubbleSort(int[] arr) {

        for (int i = 0; i < (arr.length - 1); i++) {
            for(int j=0;j<(arr.length-i-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }System.out.print("Asscendind order: ");
        for(int array:arr){
            System.out.print(array+" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 5;
        arr[4] = 3;
        for (int i : arr) {
            System.out.print(i);
        }

        BubbleSort(arr);


    }
}
