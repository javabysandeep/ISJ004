package classComponents.blocks;

public class Demo1 {
   //no name,
    {
        System.out.println("instance block");
    }

    Demo1(){
        //1.constructor call of the super class - super();
        super();
        //2. instance block of the same class.
        System.out.println("Zero parameterized constructor");

    }
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println("main method");
    }
}
