package Project.Practice;
// counting number of words in string

public class countString {

    public static void main(String[] args) {
        String text=" India is my country h";
        String a=text.trim();
        int b=a.length();
        int count=0;
        for (int i=0; i<b ;i++ ){
            char c=a.charAt(i);
            if (c==32){
                count++;
            }
        }
        System.out.println("Number of word is "+(count+1));

    }



}
