package java8Features;

public class A {
    A() {
    }

    A(int a, int b) {
        System.out.println(a + b);
    }
}

class B extends A {
    int a = 10;
    int b = 10;
    B(){

    }

    B(int a, int b) {
        this();
    }
}