package exceptionHandling;

public class Demo15TryCatchFinallyException {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("invalid input");
            System.out.println(10 / 0);
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
        //invalid input --> finally --> AE
    }
}
