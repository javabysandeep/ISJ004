package exceptionHandling;

public class Demo17 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {
                System.out.println("inner catch");
            }
            System.out.println("outer try");
        } catch (ArithmeticException ae) {
            System.out.println("outer catch");
        }
    }
}
