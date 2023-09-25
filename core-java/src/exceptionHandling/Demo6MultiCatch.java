package exceptionHandling;

public class Demo6MultiCatch {
    public static void main(String[] args) {
        try {
            int[] array = {1};
            System.out.println(array[0]);

            String str = null;
            System.out.println(str.length());

            System.out.println(10 / 0);

        } catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException exception) {
            System.out.println("invalid operation");
        }
        System.out.println("rest of the code");
    }
}
