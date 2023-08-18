package classComponents.variable;

class B {

    public static void main(String[] args) {
        //p : iv
        A ref = new A();
        System.out.println(ref.p);//1
        //q : sv
        System.out.println(A.q);//2
        System.out.println(ref.q);//2

        B bRef = new B();
        bRef.instanceMethod();

    }

    void instanceMethod() {

        //p : iv
        A ref = new A();
        System.out.println(ref.p);//1

        //q : sv
        System.out.println(A.q);//2
        System.out.println(ref.q);//2
    }

}