package controlStatements.looping.forLoop.patterns;

public class Pattern6 {
    public static void main(String[] args) {
        /*
         *  0
         *  1 1
         *  0 0 0
         *  1 1 1 1
         *  0 0 0 0 0
         * */
        for (int row = 1; row <= 5; row++) {
            //print multiple stars
            for (int column = 1; column <= row; column++) {
                System.out.print(row % 2 == 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
