package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println("Division is " + number1 / number2);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Input mismatch");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid input");
        }
        System.out.println("Rest of the program");

    }
}
