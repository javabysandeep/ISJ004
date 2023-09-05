package oops.inheritance;

public class Parent {
    int instanceVariable1 = 100;
    static int staticVariable2 = 200;

    void instanceMethod() {
        System.out.println("Parent : instance method");
    }

    static void staticMethod() {
        System.out.println("Parent : Static method");
    }

    {
        System.out.println("Parent : Instance Block");
    }

    static {
        System.out.println("Parent : Static Block");
    }

    Parent() {
        super();
        //instance block of same class
        System.out.println("Parent constructor");
    }
}
