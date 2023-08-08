package controlStatements.looping;

public class Demo18 {
    public static void main(String[] args) {
        //Perfect  Number  : given number = sum of its facrtors
        // 10 = 1,2,5
        //6 = 1,2,3
        //28= 1,2,4,7,14
        //100 = 1,2,4,5,10,20,25,50
        int number = 6;
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors = sumOfFactors + i;
                System.out.println("its a factor " + i);
            }
        }
        System.out.println(sumOfFactors == number ? "Its perfect" : "Not a perfect");
    }
}
