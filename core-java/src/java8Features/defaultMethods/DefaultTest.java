package java8Features.defaultMethods;

public class DefaultTest {
    public static void main(String[] args) {
        I a = new A();
        I b = new B();
        I c = new C();

        a.m1();
        b.m1();
        c.m1();

        a.m2();
        b.m2();
        c.m2();
    }
}
