package oops.abstraction.abstractClass;

public class MultiLevelInheritanceInAbstraction {
    public static void main(String[] args) {
        abstract class A{
            abstract void m1();
        }
        abstract class B extends A{
            abstract void m2();
        }
        class C extends B {
            @Override
            void m1() {
                System.out.println("m1 in c");
            }

            @Override
            void m2() {
                System.out.println("m2 in c");
            }
        }

        A c = new C();
        c.m1();
        //c.m2();//CTE
    }
}
