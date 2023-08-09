package controlStatements.looping.forLoop.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        /*
         *   *****
         *   *****
         *   *****
         *   *****
         *   *****
         *
         * */
        for (int row = 1; row <= 5; row++) {
            //print multiple stars
            for (int column = 1; column <= 5; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
