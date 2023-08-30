package classComponents.nestedClasses;

public class AccessingStaticNestedClassMembers {
    public static void main(String[] args) {
        // static nested class members

       //accessing P class : instance variable and instance method
        A.P ref = new A.P();
        System.out.println("P class instance variable "+ref.instanceVariable);
        ref.instanceMethod();

        //accessing the P class : static variable and static method
        System.out.println("P class static variable "+A.P.staticVariable);
        A.P.staticMethod();
    }
}
// JDK 8: what, how, why, what all components, how to access members
