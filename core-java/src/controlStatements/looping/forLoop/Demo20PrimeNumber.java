package controlStatements.looping.forLoop;

public class Demo20PrimeNumber {
    public static void main(String[] args) {
        int number = 100;
        //the number which is only divisible by 1 and number itself.
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % 2 == 0 && number != 2) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "prime" : "not a prime");
    }
}
