package exceptionHandling;

public class Demo23ThrowsKeyword {
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

    public static void m3(){
       // throw new ClassNotFoundException("class is not there");
    }
}

class C {
    static {
        System.out.println("Class C loaded int the memory");
    }
}