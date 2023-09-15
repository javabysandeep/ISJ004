package array;

public class Demo7ArrayElementSum {
    public static void main(String[] args) {
        int[] array = {11, 34, 21, 56, 88};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        System.out.println("Sum of array elements " + sum);
    }
}
