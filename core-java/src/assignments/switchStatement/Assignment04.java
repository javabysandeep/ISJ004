package assignments.switchStatement;

import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        //Take two numbers from user and an operator (+, -, *, /) and then calculate the value. (Use switch statement)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1 and number2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Enter the Operator");
        String operator = scanner.next();

        switch (operator) {
            case "+" -> System.out.println(number1 + number2);
            case "-" -> System.out.println(number1 - number2);
            case "*" -> System.out.println(number1 * number2);
            case "/" -> System.out.println(number1 / number2);
            case "%" -> System.out.println(number1 % number2);
            default -> System.out.println("Invalid operator");
        }
    }
}
