package classComponents.variable;

class A {
    int p = 1;
    static int q = 2;

    public static void main(String[] args) {
        int p = 10;
        int q = 20;
        int r = 30;

        A ref = new A();
        //local variable
        System.out.println(p); //10
        System.out.println(q); //20
        System.out.println(r); //30

        //static variable
        System.out.println(A.q); //2
        System.out.println(ref.q); //2

        //instance variable
        System.out.println(ref.p); //1

		ref.instanceMethod();

    }

    void instanceMethod() {
        System.out.println(p);
        System.out.println(this.p);

        System.out.println(A.q);
        System.out.println(q);
        System.out.println(this.q);

    }

}