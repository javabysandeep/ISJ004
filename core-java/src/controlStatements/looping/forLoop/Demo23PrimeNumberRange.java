package controlStatements.looping.forLoop;

public class Demo23PrimeNumberRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            //the number which is only divisible by 1 and number itself.
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime " + number);
            }
        }
    }
}
