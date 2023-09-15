package array;

public class Demo12SecondMaxArrayElement {
    public static void main(String[] args) {
        int[] array = {65, 93, 72, 65, 60, 60, 58, 60, 64, 64, 72, 68, 52};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                secondMax = max;
                max = array[index];
            }
            if (array[index] > secondMax && array[index] < max) {
                secondMax = array[index];
            }
        }
        System.out.println("Max " + max);
        System.out.println("Second Max " + secondMax);
    }
}
