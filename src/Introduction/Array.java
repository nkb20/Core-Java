package Introduction;

import java.util.Arrays;

public class Array {

    public static void main(String[] aftg){

        String[] arr= {"\"AFtab\"", "khan","Rokal","John"};
        arr[2]="Rahul";

/*        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

            String a=(i<(arr.length-1))? ", ":" ";
System.out.print(a);
    }*/
        for (String i:arr){
            System.out.println(i);
        }

        System.out.println("\"MultiDimensional Array\"");

        int[][] arr1={{2,5,8,9},{3,4,6,7,1} };
        System.out.println(arr1[1][3]);

        for (int i=0;i<(arr1.length);++i){
            for(int j=0;j<(arr1[i].length);++j){

                System.out.print(arr1[i][j]);

            }
        }



    }
}
