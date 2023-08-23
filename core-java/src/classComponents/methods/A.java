package classComponents.methods;

public class A {
    void instanceMethod() {
        System.out.println("Class A : instance method");
    }

    static void staticMethod() {
        System.out.println("Class A : static method");
    }

    public static void main(String[] args) {
        //same class : static method
        A a = new A();
        a.instanceMethod();

        staticMethod();
        A.staticMethod();
        a.staticMethod();
        //this.staticMethod();//this is available inside the instance scope

        System.out.println("calling display method");

        a.display();

    }

    public void display() {
        instanceMethod();
        this.instanceMethod();

        staticMethod();
        A.staticMethod();
        this.staticMethod();

    }
}
