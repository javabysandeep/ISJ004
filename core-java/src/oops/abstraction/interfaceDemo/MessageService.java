package oops.abstraction.interfaceDemo;

public interface MessageService {
    int staticVariable =10; // variables are by default : public static final

     void sendMessage(); // methods are by default : public abstract

    //void instanceMethod(){} // instance methods are not allowed

    static void staticMethod(){
        System.out.println("static method");
    } //static methods are allowed

   public default void defaultMethod(){
       System.out.println("default method");
   } // default method

    //MessageService(){} // constructors are not allowed

    //{}
    //static {}//blocks are not allowed

    public static class NestedClass {} // by default nested classes are public static

    public static void main(String[] args) {
        System.out.println("static variable "+MessageService.staticVariable);
        MessageService.staticMethod();
    }
}
