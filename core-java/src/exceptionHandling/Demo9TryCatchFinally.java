package exceptionHandling;

public class Demo9TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] array = {1};
            System.out.println(array[0]);

            String str = null;
            System.out.println(str.length());

            System.out.println(10 / 0);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("invalid operation");
        } finally {
            System.out.println("database connection closed");
        }
        System.out.println("rest of the code");
    }
}
