package controlStatements.looping.doWhile;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = scanner.next().charAt(0);
        do {
            System.out.println("You have entered " + ch);
            ch = scanner.next().charAt(0);
        } while (ch != 'x');

        char ch1 = 65;
        char ch2 = 66;
        int sum = ch1 + ch2;
    }
}
