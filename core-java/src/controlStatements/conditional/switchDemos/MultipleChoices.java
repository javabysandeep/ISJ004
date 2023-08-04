package controlStatements.conditional.switchDemos;

public class MultipleChoices {
    public static void main(String[] args) {
        int input = 1;
        //byte, short, int, char, String, enum : Wrapper classes: Byte, Short, Integer, Character
        switch (input) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid");
                break;

        }

    }
}
