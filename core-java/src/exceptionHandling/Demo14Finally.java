package exceptionHandling;

public class Demo14Finally {
    public static void main(String[] args) {
        try {
            System.exit(0);
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("invalid input");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Rest of the code");
        //AE
    }
}
