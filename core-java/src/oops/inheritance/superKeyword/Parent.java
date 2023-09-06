package oops.inheritance.superKeyword;

public class Parent {
    int instanceVariable = 100;

    void instanceMethod() {
        System.out.println("Parent: instance method");
    }

    {
        System.out.println("Parent: instance block");
    }

    public Parent() {
        System.out.println("Parent: constructor");
    }
}
