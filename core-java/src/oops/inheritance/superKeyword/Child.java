package oops.inheritance.superKeyword;

public class Child extends Parent {
    int instanceVariable = 200;

    void instanceMethod() {
        System.out.println("Child: instance method");
    }

    {
        System.out.println("Child: instance block");
    }

    public Child() {
        System.out.println("Child: constructor");
    }

    public static void main(String[] args) {
       /* Parent parent = new Parent();
        System.out.println(parent.instanceVariable);
        parent.instanceMethod();*/

        Child child = new Child();
        System.out.println(child.instanceVariable);
        child.instanceMethod();


    }

}
