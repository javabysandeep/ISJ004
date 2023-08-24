package assignments.methods;

public class Assignment2 {
    public static void main(String[] args) {
        int[] array = {1090, 30, 5090, 70, 98, 87, 111};
        int maximum = -2147483648;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > maximum) {
                maximum = array[index];
            }
        }
        System.out.println("maximum " + maximum);
    }


}
