package array;

public class Demo4AccessingArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 11};
        System.out.println(array);//reference value : kind of memory location of the object

        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println(array[3]);//11
        System.out.println(array[4]);// ArrayIndexOutOfBoundsException at runtime

        // index range for given array : 0 to 3
    }
}
