package DataStructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Array {
    public static void main(String[] args) {
        int [] arr= new int[5];

        Scanner scn=new Scanner(System.in);

        System.out.println("Enter any 5 number");
        for (int i=0;i<arr.length;i++){

           arr[i]= scn.nextInt();

        }
        for (int i:arr){
            System.out.print(i+" ");

        }
        Arrays.sort(arr);
        System.out.print("\nSorted array is: ");
        for (int i:arr){
            System.out.print(i+" ");

        }
    }
}
