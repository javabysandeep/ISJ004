package controlStatements.conditional.ifElseDemos;

public class MultipleChoices {
    public static void main(String[] args) {
        int input = 11;
        if (input == 1) {
            System.out.println("One");
        }
        if (input == 2) {
            System.out.println("Two");
        }
        if (input == 3) {
            System.out.println("Three");
        }
        if (input == 4) {
            System.out.println("Four");
        }
        if (input == 5) {
            System.out.println("Five");
        }
        if (input == 6) {
            System.out.println("Six");
        }
        if (input == 7) {
            System.out.println("Seven");
        }
        if (input == 8) {
            System.out.println("Eight");
        }
        if (input == 9) {
            System.out.println("Nine");
        }
        if (input == 10) {
            System.out.println("Ten");
        }
        if (input < 1 || input > 10) {
            System.out.println("Not a valid input");
        }
    }
}
