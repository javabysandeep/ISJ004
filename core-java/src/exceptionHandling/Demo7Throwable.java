package exceptionHandling;

public class Demo7Throwable {
    public static void main(String[] args) {
        try {
            int[] array = {};
            System.out.println(array[0]);

            String str = null;
            System.out.println(str.length());

            System.out.println(10 / 0);

        }
        //System.out.println("independent statements are not allowed");
        catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Index out of range");
        }
        catch (Throwable throwable) {
            System.out.println("Generic exception handler");
        }

        System.out.println("rest of the code");
    }
}
