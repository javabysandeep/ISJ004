package exceptionHandling;

import java.util.Scanner;

public class Demo24 {
    public static void main(String[] args) {
        divide();
    }

    public static void divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2 == 0) {
            throw new ArithmeticException("invalid denominator");
        }
        System.out.println(number1 / number2);
    }
}
