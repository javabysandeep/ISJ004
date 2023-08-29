package classComponents.nestedClasses;

public class NestedClasses {
    //static nested class
    static class A {
        static int a= 100;
        static void m1(){}
        static {}
        static class Nested{}
    }

    //non-static nested class or inner class
    class B {
       /* static int a= 100;
        static void m1(){}
        static {}
        static class Nested{}*/
    }

    void m1() {
        //local inner class
        class C {
            /*static int a= 100;
            static void m1(){}
            static {}
            static class Nested{}*/
        }
    }
}
