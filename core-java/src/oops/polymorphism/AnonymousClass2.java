package oops.polymorphism;

public class AnonymousClass2 {
    public static void main(String[] args) {
        class A {
            void display(){
                System.out.println("A class method");
            }
        }
        class B extends A {
        }
        B b = new B();
        A ab = new B();

        A ref = new A() {
            void display(){
                System.out.println("anonymous class method");
            }
        };//created object of anonymous class and not A class
        ref.display();

    }
}

