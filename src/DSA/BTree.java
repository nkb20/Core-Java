package DSA;

import java.util.Scanner;

public class BTree {
    static Scanner scn=null;
    public static void main(String[] args) {
        scn= new Scanner(System.in);

        Node root=createTree();
    }

    static Node createTree(){

        Node root=null;
        System.out.println("Enter data");

        int data=scn.nextInt();

        if(data== -1){
           return null;
       }
        root = new Node(data);


        System.out.println("Enter left for "+ data);
        root.left=createTree();

        System.out.println("Enter right for "+ data);
        root.right=createTree();


        return root;
    }
}


class Node {
 Node left ,right;
 int data;
 public Node(int data){
     this.data=data;
 }
}