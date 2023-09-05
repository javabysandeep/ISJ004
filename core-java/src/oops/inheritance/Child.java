package oops.inheritance;

public class Child extends Parent{
    static {
        System.out.println("Child : Static Block");
    }
    {
        System.out.println("Child : instance Block");
    }
    Child(){
        super();
        //instance block of the same class
        System.out.println("Child : constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.instanceVariable1);
        child.instanceMethod();

        System.out.println("Static variable of Parent class "+Parent.staticVariable2);
        Parent.staticMethod();
    }

    //1. parent class static block
    //2. child class static block
    //3. parent class instance block
    //4. parent class constructor
    //5. child class instance block
    //6. child class constructor
}
