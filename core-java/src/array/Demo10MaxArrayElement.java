package array;

public class Demo10MaxArrayElement {
    public static void main(String[] args) {
        int[] array = {65, 93, 72, 65, 60, 60, 58, 60, 64, 64, 72, 68, 52};
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
        System.out.println("Max array element "+max);
    }
}
