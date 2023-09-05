package oops.inheritance;

public class B extends A {

    int iv = 200;

    void instanceMethod() {
        System.out.println("instance method B");
    }

    public static void main(String[] args) {
        // Case 1 : Parent parent = new Parent();
       /* A a = new A();
        System.out.println(a.iv);
        a.instanceMethod();*/

        // Case 4 : Child childRef = new Parent();
        // B ba = new A();//CTE

        //Case 2 : Child child = new Child();
        B b = new B();
        System.out.println(b.iv);
        b.instanceMethod();
        b.accessingParentClass();


    }

    void accessingParentClass(){
        System.out.println(super.iv);
        super.instanceMethod();
    }
}
