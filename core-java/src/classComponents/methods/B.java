package classComponents.methods;

public class B {
    public static void main(String[] args) {
        A a = new A();
        a.instanceMethod();

        A.staticMethod();
        a.staticMethod();//this is not recommended.

        //calling same class instance method from same class static method
        B b = new B();
        b.display();
    }

    public void display() {
        A a = new A();
        a.instanceMethod();

        A.staticMethod();
        a.staticMethod();
    }
}
