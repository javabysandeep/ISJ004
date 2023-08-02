package operator.incrementDecrement;

public class Demo5ArithmeticIncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a++ + ++b + --a + b--);//24
        //a = 5 , b= 6
        //                  5 + 7 + 5 + 7 = 24
        System.out.println(a);//5
        System.out.println(b);//6
    }
}
