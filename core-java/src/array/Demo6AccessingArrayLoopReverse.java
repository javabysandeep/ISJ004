package array;

public class Demo6AccessingArrayLoopReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 11};
        //just printing the array content from last index to first index
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + ", ");
        }
    }
}
