package array;

public class Demo14SwapNumber {
    public static void main(String[] args) {
        int[] array = {65, 93, 72, 65, 60, 68, 52};
        array[2] = 53;


        System.out.println("printing the array content");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}
