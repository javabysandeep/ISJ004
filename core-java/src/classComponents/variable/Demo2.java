package classComponents.variable;

public class Demo2 {
    public static void main(String[] args) {
        Demo1 reference = new Demo1();
        System.out.println("static variable " + Demo1.b);
        System.out.println("static variable " + reference.b);

        //instance variable : from static method or block , we can access using reference variable
        System.out.println("Instance variable " + reference.a);

        System.out.println("calling instance method ");
        reference.instanceMethod();
    }

    public void instanceMethod() {
        System.out.println("static variable " + Demo1.b);
        Demo1 reference = new Demo1();
        System.out.println("Instance variable " + reference.a);
    }
}
