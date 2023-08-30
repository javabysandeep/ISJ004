package accessSpecifiers.p1;

public class A {
    static public int a = 1;
    static private int b = 2;
    static protected int c = 3;
    static int d = 4;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
