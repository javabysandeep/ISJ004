package oops.inheritance.superKeyword;

public class R extends Q {
    int a = 100;
    int b = 200;
    int c = 300;

    void printVariables() {
        System.out.println("Q - a : " + super.a);
        System.out.println("Q - b : " + super.b);
        System.out.println("Q - c : " + super.c);

        System.out.println("R - a : " + this.a);
        System.out.println("R - b : " + this.b);
        System.out.println("R - c : " + this.c);

        System.out.println("R - a : " + a);
        System.out.println("R - b : " + b);
        System.out.println("R - c : " + c);
    }

    public static void main(String[] args) {
        R r = new R();
        r.printVariables();
    }
}
