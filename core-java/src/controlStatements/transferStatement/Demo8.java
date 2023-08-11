package controlStatements.transferStatement;

public class Demo8 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i == 13) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main method");
    }
}
