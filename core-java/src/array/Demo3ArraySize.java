package array;

public class Demo3ArraySize {
    public static void main(String[] args) {
        int[] array1 = new int[-5];//NegativeArraySizeException
//        int[] array2 = new int[];//array size cannot be empty
        int[] array2 = new int[0];// we can
        System.out.println(array2.length);//0

        int[] array3 = new int['a'];
        System.out.println(array3.length);

//        int[] array = new int[10.40f];//array size cannot be float or double

//        int[] array5 = new int[100L];//long is also not allowed
    }
}
