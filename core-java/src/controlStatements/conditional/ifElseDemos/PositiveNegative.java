package controlStatements.conditional.ifElseDemos;

public class PositiveNegative {
    public static void main(String[] args) {
        int number = -90;
        if (number > 0) {
            System.out.println("its positive");
        } else {
            if (number < 0) {
                System.out.println("its Negative");
            } else {
                System.out.println("its zero");
            }
        }
    }

}
