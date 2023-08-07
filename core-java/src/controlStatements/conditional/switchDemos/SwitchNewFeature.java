package controlStatements.conditional.switchDemos;

public class SwitchNewFeature {
    public static void main(String[] args) {
        int input = 3;
        //byte, short, int, char, String, enum : Wrapper classes: Byte, Short, Integer, Character
        //we don't need to write break
        switch (input) {
            default -> System.out.println("Invalid");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");

        }


    }
}
