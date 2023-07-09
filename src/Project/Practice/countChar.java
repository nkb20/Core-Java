package Project.Practice;

public class countChar {
    public static void main(String[] args) {
        String text=" India is my country k";
        String a=text.trim();
        int b=a.length();
        int count=0;
        for (int i=0; i<b ;i++ ){
            char c=a.charAt(i);
            if (c!=32){
                count++;
            }
        }
        System.out.println("Number of word is "+(count));



    }
}
