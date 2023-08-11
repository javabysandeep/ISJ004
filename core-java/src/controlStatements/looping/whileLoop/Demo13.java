package controlStatements.looping.whileLoop;

public class Demo13 {
    public static void main(String[] args) {
        int number = 456;
        while (number > 0) {
            System.out.println(number % 10);
            number = number / 10;
        }
    }
}
