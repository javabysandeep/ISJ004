package java8Features.lambdaExpesssion.examples;

public class LambdaExpressions {
    public static void main(String[] args) {
        I1 i1 = () -> System.out.println("I1 m1 method");
        i1.m1();

        I2 i2 = (a) -> a * a;
        System.out.println(i2.m1(10));

        I3 i3 = (a) -> System.out.println("I3 m1 " + a);
        i3.m1(10);

        I4 i4 =    () -> 10;
        System.out.println(i4.m1());
    }
}
