package exceptionHandling;

public class Demo20ExceptionPropagation {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0));
        } catch (ArithmeticException ae) {
            System.out.println("Invalid denominator");
        }
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
}
