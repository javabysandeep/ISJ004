package exceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
       throw new ArithmeticException("problematic situation");
       // System.out.println("rest of the main");

        /*Exception in thread "main" java.lang.ArithmeticException: problematic situation
	at exceptionHandling.Demo3.main(Demo3.java:5)

*/


    }
}
