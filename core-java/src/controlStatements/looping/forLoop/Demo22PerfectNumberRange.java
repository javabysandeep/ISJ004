package controlStatements.looping.forLoop;

public class Demo22PerfectNumberRange {
    public static void main(String[] args) {
        //check a single number if it is perfect
        for (int number = 1; number <= 10000; number++) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println("perfect number " + number);
            }
        }
    }
}
