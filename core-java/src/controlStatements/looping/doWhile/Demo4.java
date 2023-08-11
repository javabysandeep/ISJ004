package controlStatements.looping.doWhile;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character");
        char ch = scanner.next().charAt(0);
        while (ch != 'x') {
            System.out.println("You have entered " + ch);
            ch = scanner.next().charAt(0);
        }
    }
}
