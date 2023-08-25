package classComponents.methods.methodOverloadind;

public class MainMethodOverloading {
    public static void main(String[] args) {
        main(100);
        main();
    }

    public static void main(int number) {
        System.out.println("main method overloading number parameter");
    }

    public static void main() {
        System.out.println("main method no parameters");
    }
}
