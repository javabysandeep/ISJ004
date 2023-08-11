package controlStatements.looping.forLoop;

public class Demo24FactorialNumber {
    public static void main(String[] args) {
        //5! = 5 * 4 * 3 * 2 * 1 = 120
        //5! = 1 * 2 * 3 * 4 * 5 = 120
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <=number ; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
