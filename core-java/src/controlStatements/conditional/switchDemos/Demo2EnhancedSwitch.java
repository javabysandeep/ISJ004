package controlStatements.conditional.switchDemos;

public class Demo2EnhancedSwitch {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1 -> System.out.println("One");
            case 2 -> {
                System.out.println("Two");
                System.out.println("Two");
            }
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            default -> System.out.println("Invalid choice");
        }
    }
}
