package Recursion;

public class Palindrome {
    public static void PalindromeInt(int a) {
        int sum = 0;

        int temp = a;
        while (a > 0) {
            int b = a % 10;
            sum = (sum * 10) + b;
            a = a / 10;

        }
        String b = (sum == temp) ? "Number is Palindrome" : "Not a Palindrome";
        System.out.println(b);

    }

    public static void PalindromeString(String str){

//        String str1=str.toLowerCase();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){

            reverse=reverse+str.charAt(i);
//            System.out.println(reverse);

        }
        String a=(str.toLowerCase().equals(reverse.toLowerCase()) )? "Sring " +str+" is a Palindrome": "String "+str+
                "is not a palindrome";
        System.out.println(a);

    }

    public static void main(String[] args) {

        int a = 123454321;
        PalindromeInt(a);

        String name="abcba";
        PalindromeString(name);

    }
}
