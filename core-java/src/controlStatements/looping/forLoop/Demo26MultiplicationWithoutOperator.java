package controlStatements.looping.forLoop;

public class Demo26MultiplicationWithoutOperator {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 2;
        int multiplication = 0;
        // 5 + 5
        // 2 + 2 + 2 + 2 + 2
        System.out.println(number1 * number2);//10
        for (int i = 1; i <= number1; i++) {
            multiplication = multiplication + number2;
        }
        System.out.println(multiplication);
    }
}
