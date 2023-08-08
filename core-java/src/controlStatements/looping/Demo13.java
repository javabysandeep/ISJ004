package controlStatements.looping;

public class Demo13 {
    public static void main(String[] args) {
        // Sum of numbers from 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers from 1 to 100 is : " + sum);
    }
}
