package java8Features.defaultMethods;

public interface I {
    void m1();

   default void m2(){
        System.out.println("default implementation");
    }

}
