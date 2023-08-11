package controlStatements.looping.forLoop;

public class Demo27Division {
    public static void main(String[] args) {
        int number1 = 90;
        int number2 = 30;
        //without using /
        // without using %
        int quotient = 0;
        while (number1 >= number2) {
            number1 = number1 - number2;
            quotient++;
        }
        System.out.println("Quotient " + quotient);
        System.out.println("Remainder " + number1);

        //GCD : Greatest Common Divisor
        // 10 :  1,2,5
        // 20 :  1,2,4,5,10

        //LCM : Least Common Multiple
        //HCF : Highest Common Factor

        //fibonacci
        //t


    }
}
