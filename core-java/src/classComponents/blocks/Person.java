package classComponents.blocks;

public class Person {
    //what it is?
    // it is a block of code written inside the curly braces outside  all methods, constructors, block
    //without any access specifier, access modifier, return type, name, parameters

    //2. when object is created, then instance block will be executed.

    //3. why do we need this?-
    //  this confirms object is created.
    // to maintain no. of objects created.
    //to maintain any logging information
    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }
    Person(){
        super();
        System.out.println("Zero param con");
    }

    public static void main(String[] args) {
        Person person = new Person();
    }
}
