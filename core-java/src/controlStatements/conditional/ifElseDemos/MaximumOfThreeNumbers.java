package controlStatements.conditional.ifElseDemos;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        int number3 = 300;
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }

    }

}
