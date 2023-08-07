package assignments.operator;

public class Assignment16ReverseLoop {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;
        int digit = 0;

        while (number > 0) {
            digit = number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }
        System.out.println("reverse number " + sum);

    }
}
