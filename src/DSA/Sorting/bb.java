package DSA.Sorting;

public class bb {
    static void is(int[] array) {
        //12 | 9 8 7 5
        //9 12 | 8 7 5


        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;

            }
            array[j+1]=current;

        }


        for (int arr : array) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 9;
        array[1] = 55;
        array[2] = 4;
        array[3] = 7;
        array[4] = 6;

        is(array);

    }
}