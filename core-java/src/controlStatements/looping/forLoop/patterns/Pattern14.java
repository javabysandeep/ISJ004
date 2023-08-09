package controlStatements.looping.forLoop.patterns;

public class Pattern14 {
    public static void main(String[] args) {
        /*
         *           *
         **         * *
         *         * * *
         *       *  *  *  *
         *         * * * * *
         *       * * * *
         *        * * *
         *         * *
         *          *
         *
         * */

        //upper triangle
        for (int row = 1; row <= 5; row++) {
            //spaces
            for (int space = 4; space >= row; space--) {
                System.out.print("  ");
            }
            //stars
            for (int stars = 1; stars <= row; stars++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //lower triangle
        for (int row = 4; row >= 1; row--) {
            //spaces
            for (int space = row; space <= 4; space++) {
                System.out.print("  ");
            }
            //stars
            for (int stars = row; stars >= 1; stars--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
