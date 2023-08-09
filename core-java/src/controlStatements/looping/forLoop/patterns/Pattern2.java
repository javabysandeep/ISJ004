package controlStatements.looping.forLoop.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        /*
         *   *
         *   **
         *   ***
         *   ****
         *   *****
         *
         * */
        for (int row = 1; row <= 5; row++) {
           //print multiple stars
            for (int column = 1; column <=row ; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
