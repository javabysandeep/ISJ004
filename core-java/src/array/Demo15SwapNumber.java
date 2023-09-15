package array;

public class Demo15SwapNumber {
    public static void main(String[] args) {
        int[] array = {65, 93, 72, 65, 60, 68, 52};
        int left = 0;
        int right = array.length - 2;
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;

        System.out.println("printing the array content");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
