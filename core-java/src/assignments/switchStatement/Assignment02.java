package assignments.switchStatement;

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int input = number > 0 ? 1 : number < 0 ? 2 : 0;
        switch (input) {
          /*  case 0 -> System.out.println("neutral");
            case 1 -> System.out.println("Positive");
            case 2 -> System.out.println("Negative");*/
        }
    }
}
