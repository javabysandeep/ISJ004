package exceptionHandling;

public class Demo22ThrowsKeyword {
    public static void main(String[] args) {
        try {
            m1();
        } catch (ClassNotFoundException ae) {
            System.out.println("Invalid class");
        }
    }

    public static void m1() throws ClassNotFoundException {
        m2();
    }

    public static void m2() throws ClassNotFoundException {
        m3();
    }

    public static void m3() throws ClassNotFoundException {
        Class.forName("exceptionHandling.Ba");
    }
}

class B {
    static {
        System.out.println("Class B loaded int the memory");
    }
}