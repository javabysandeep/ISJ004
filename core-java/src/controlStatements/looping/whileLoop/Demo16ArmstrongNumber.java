package controlStatements.looping.whileLoop;

public class Demo16ArmstrongNumber {
    public static void main(String[] args) {
        //armstrong : sum of digit cube = given number
        int number = 153;
        int oldNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        System.out.println("Sum of digits " + sum);
        System.out.println(oldNumber == sum ? "its armstrong" : "not a armstrong");
    }
}
