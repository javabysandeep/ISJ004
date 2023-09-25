package exceptionHandling;

public class Demo8Array {
    public static void main(String[] args) {
        int[] array = null;
        System.out.println("Maximum element from the given array " + maxElement(array));

    }

    private static int maxElement(int[] array) {

        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
        }
        return max;
    }
}
