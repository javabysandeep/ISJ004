package array;

public class Demo8ArrayEvenElementSum {
    public static void main(String[] args) {
        int[] array = {11, 34, 21, 56, 88};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                sum += array[index];
            }
        }
        System.out.println("Sum of Even array elements " + sum);
    }
}
