package array;

public class Demo11MinArrayElement {
    public static void main(String[] args) {
        int[] array = {65, 93, 72, 65, 60, 60, 58, 60, 64, 64, 72, 68, 52};
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        System.out.println("Min array element "+min);
    }
}
