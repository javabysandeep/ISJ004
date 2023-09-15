package array;

public class Demo18MultiDimension {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };

        for (int row = 0; row < array.length ; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }


    }
}
