package classComponents.blocks;

public class A {
    static {
        System.out.println("static block A");
    }

    {
        System.out.println("Instance  block A");
    }

    A() {
        System.out.println("A constructor");
    }

    void m1() {
        System.out.println("A : m1");
    }
}
