package exceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(10/0);
       // throw new ArithmeticException();
        System.out.println("Rest of the main");
        main(null);//StackOverFlowError

    }
}
