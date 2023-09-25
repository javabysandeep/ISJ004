package exceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        System.out.println(get());
    }

    public static int get() {
        try {
            return 1;
        } catch (ArithmeticException ae) {
            return 2;
        } finally {
            return 3;
        }
    }

}
