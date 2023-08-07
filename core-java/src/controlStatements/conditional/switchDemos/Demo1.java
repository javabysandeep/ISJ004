package controlStatements.conditional.switchDemos;

public class Demo1 {
    public static void main(String[] args) {
        int value = 1;
        int a = 1;

        switch (value) {
            default:
                System.out.println("Invalid choice");
                break;
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
                System.out.println("Five");
                break;
        }
    }

}
