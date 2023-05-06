package Introduction;

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        System.out.print("Enter a number for table: ");
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int i,rslt=n;
        /*2*1=2
        2*2=4*/
        for (i=1;i<=10;i++){

            System.out.print(n+"*"+i+"="+rslt+" ");
            rslt+=n;
        }
System.out.println();
        //using while loop
        i=1;
        int x=n;
        rslt=n;
        do{

            System.out.print(n+"*"+i+"="+rslt+" ");
            i++;
            rslt=x*i;

        }
        while(i<=20);

    }
}
