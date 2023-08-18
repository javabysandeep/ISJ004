package classComponents.variable;

public class Demo1 {
    int a = 100;
    static int b = 1000;

    public static void main(String[] args) {
        int c = 10000;
        Demo1 reference = new Demo1();
        //local variable : we can access directly
        System.out.println("Local variable " + c);

        //static variable : we can access directly, using classname, using reference
        System.out.println("static variable " + Demo1.b);
        System.out.println("static variable " + b);
        System.out.println("static variable " + reference.b);

        //instance variable : from static method or block , we can access using reference variable
        System.out.println("Instance variable " + reference.a);
        // System.out.println("Instance variable " + this.a);// this cannot be used in static context

        System.out.println("calling instance method ");
        reference.instanceMethod();
    }

    public void instanceMethod() {
        System.out.println("static variable " + b);
        System.out.println("static variable " + Demo1.b);
        System.out.println("static variable " + this.b);

        System.out.println("instance variable " + a);
        System.out.println("instance variable " + this.a);
    }
}
