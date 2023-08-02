package operator.incrementDecrement;

public class Demo6 {
    public static void main(String[] args) {
        int p = 1;
        int q = 2;
        int r = 3;
        System.out.println(p++ - q++ + r++ + p + q + r + ++p + ++q + ++r);//23
        System.out.println(p);//3
        System.out.println(q);//4
        System.out.println(r);//5
    }
}
