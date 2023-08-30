package classComponents.nestedClasses;

public class A {
    static int a = 200;
    int b= 1000;
    static class P {
        int instanceVariable = 10;
        static int staticVariable = 100;

        void instanceMethod() {
            System.out.println("instance method");
        }

        static void staticMethod() {
            System.out.println("static method");
        }
    }

    class Q {
        int instanceVariable = 10;

        void instanceMethod() {
            System.out.println("instance method");
        }

    }

    public static void main(String[] args) {
        class R {
            int instanceVariable = 10;
            void instanceMethod() {
                System.out.println("R : instance method");
            }
        }

        R r = new R();

        System.out.println("Local Inner class Instance variable "+r.instanceVariable);
        r.instanceMethod();

    }
}
