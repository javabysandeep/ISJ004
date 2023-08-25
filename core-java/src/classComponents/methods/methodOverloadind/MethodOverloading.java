package classComponents.methods.methodOverloadind;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10.35f, 20.45f));
        System.out.println(add(10, 20, 30));
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static float add(float number1, float number2) {
        return number1 + number2;
    }

    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
