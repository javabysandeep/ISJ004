package oops.abstraction.abstractClass;

public abstract class A {
    int iv = 100;
    static int sv = 200;

    void instanceMethod() {
        System.out.println("A: instance method");
    }

    static void staticMethod() {
        System.out.println("static method");
    }

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    A() {
        System.out.println("A class constructor");
    }

    public static void main(String[] args) {
   /*     A.staticMethod();
        System.out.println("Static variable "+A.sv);
*/
        //A a = new A();

        class B extends A {
            void instanceMethod() {
                super.instanceMethod();
                System.out.println("B: instance method");
            }
        }
        B b = new B();
        b.instanceMethod();
        System.out.println(b.iv);
    }
}
