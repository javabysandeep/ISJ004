package exceptionHandling;

public class Demo19ThrowsKeyword {
    public static void main(String[] args)  {
       //A a = new A();
        try {
            Class.forName("exceptionHandling.B");
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid class name");
        }
    }
}
class A {
    static {
        System.out.println("Class A loaded int the memory");
    }
}