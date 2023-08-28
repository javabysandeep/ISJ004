package classComponents.blocks;

public class Demo2 {
    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    Demo2() {
        System.out.println("con");
    }

    public static void main(String[] args) {
      Demo2 demo2 = new Demo2();
    }
}
