package oops.inheritance.superKeyword;

public class B extends A {
    int a = 200;

    void printVariables() {
       // int a = 300;
        System.out.println("Super class instance variable " + super.a); //100
        System.out.println("Instance variable " + this.a); //100
        System.out.println("Local Variable " + a);//300
    }

    public static void main(String[] args) {
        B b = new B();
        b.printVariables();
    }
}
