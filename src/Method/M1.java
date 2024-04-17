package Method;

public class M1 {

    static void stdMethod(String fName, int age) {
        System.out.println("Firs name is: " + fName + "\nAge is: " + age);
    }

    static int rMethod(int x) {
        return 2 + x;
    }

    static void checkAge(int age) {
        String a = (age < 18) ? "Access denied: You are underage" : "Access Allow: You are overage";
        System.out.println(a);
    }

    public static void main(String[] args) {
        stdMethod("Aftab", 22);

        System.out.println(rMethod(2));
        checkAge(18);
    }
}
