package assignments.methods;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Maximum : " + maximum(number1, number2, number3));
        System.out.println("Minimum : " + minimum(number1, number2, number3));
    }

    public static int maximum(int number1, int number2, int number3) {
        return number1 > number2 && number1 > number3 ? number1
                : number2 > number1 && number2 > number3 ? number2 : number3;
    }

    public static int minimum(int number1, int number2, int number3) {
        return number1 < number2 && number1 < number3 ? number1
                : number2 < number1 && number2 < number3 ? number2 : number3;
    }
}
