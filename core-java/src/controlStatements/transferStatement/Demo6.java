package controlStatements.transferStatement;

public class Demo6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");
    }
}
