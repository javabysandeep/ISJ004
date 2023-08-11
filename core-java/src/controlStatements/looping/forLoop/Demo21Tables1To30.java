package controlStatements.looping.forLoop;

public class Demo21Tables1To30 {
    public static void main(String[] args) {
        /*
         * 1 2   ....    30
         * 2 4           60
         * 3 6
         * 4 8
         * .. ..
         * 10 20         300
         *
         * */
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 30; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }
    }
}

