package controlStatements.looping.whileLoop;

public class Demo18PalindromeNumber {
    public static void main(String[] args) {
        //palindrome : given number = its reverse number
        int number = 123;
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number " + sum);
        System.out.println(originalNumber == sum ? "Palindrome" : "not a palindrome");
    }
}
