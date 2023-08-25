package classComponents.constructor;

public class B {
    int p;
    int q;
    int r;
    String str;
    B(){
        p= 100;
        q= 100;
        r= 100;
        str = "dummy value";
        System.out.println("Zero param");
    }
    public static void main(String[] args) {
        B b1 = new B();//zero parameterized con
        B b2 = new B();//zero parameterized con
        System.out.println(b1);
    }
}
