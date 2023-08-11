package controlStatements.looping.whileLoop;

public class Demo17ReverseNumber {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number " + sum);
    }
}
