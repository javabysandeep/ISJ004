package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            int[] array = {1};
            System.out.println(array[0]);

            String str = "null";
            System.out.println(str.length());

            System.out.println(10 / 0);

        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Index out of range");
        } catch (NullPointerException npe) {
            System.out.println("Operations with null reference not allowed");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid input");
        }
        System.out.println("rest of the code");
    }
}
