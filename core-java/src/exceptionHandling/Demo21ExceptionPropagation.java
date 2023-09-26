package exceptionHandling;

public class Demo21ExceptionPropagation {
    public static void main(String[] args) {
        try {
            m1();
        } catch (ArithmeticException ae) {
            System.out.println("Invalid denominator");
        }
    }

    public static void m1() {
       m2();
    }

    public static void m2() {
        m3();
    }

    public static void m3() {
        System.out.println(10 / 0);
    }
}
