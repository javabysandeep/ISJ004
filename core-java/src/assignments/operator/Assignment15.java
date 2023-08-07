package assignments.operator;

public class Assignment15 {
    public static void main(String[] args) {
        //find sum of digits
        int number = 123456789;
        int sum = 0;
      /*  int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 10 / 10 % 10;
      ;*/


      /*  int first = number % 10;
        number = number / 10;

        int second = number % 10;
        number = number / 10;

        int third = number % 10;
        number = number / 10;
        sum = first + second + third;*/

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of digits " + sum);


    }
}
