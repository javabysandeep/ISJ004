package exceptionHandling;

public class Demo12Finally {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("invalid input");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
        //invalid input --> finally --> rest of the code
    }
}
