package classComponents.nestedClasses;

public class AccessingInnerClassMembers {
    public static void main(String[] args) {
        // inner class contains only non-static member
        //to access inner class we have to create object of outer class.
        A a = new A();

        A.P p = new A.P();
        A.Q q = a.new Q();
        System.out.println("Q class instance :" + q.instanceVariable);
        q.instanceMethod();
    }
}
