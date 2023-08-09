package controlStatements.looping.forLoop.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        /*
         *         1 1 1 1 1
         *         2 2 2 2
         *         3 3 3
         *         4 4
         *         5
         *
         * */
        for (int row = 5; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(6 - row + " ");
            }
            System.out.println();
        }

    }
}
