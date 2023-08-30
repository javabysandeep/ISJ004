package classComponents.nestedClasses;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        class A {
            int a = 10;
            void m1(){}
        } // Local Inner class
        class B extends  A{} // Local Inner class

        A a = new A(){
            int a = 10;
            void m1(){}
        };
        System.out.println(a.a);


        Runnable runnable = ()->{
            System.out.println("run method");
        };//lambda expression
        runnable.run();

    }
}
