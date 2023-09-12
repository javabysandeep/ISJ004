package java8Features.defaultMethods.multipleInheritance;

public class A implements I1, I2 {
    @Override
    public void m1() {
        I1.super.m1();
        I2.super.m1();
        System.out.println("A m1");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}
