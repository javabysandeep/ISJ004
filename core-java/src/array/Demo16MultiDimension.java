package array;

public class Demo16MultiDimension {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {10, 20, 30};

//jagged array : array which contains another arrays as its elements of different size
        int[][] arrayOfArrayOfIntegers = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11, 12}
        };
        System.out.println(arrayOfArrayOfIntegers);//reference of bigger object
        System.out.println("Length of outer array "+arrayOfArrayOfIntegers.length);//3: reference of bigger object

        System.out.println("Reference of inner array "+arrayOfArrayOfIntegers[0]);//reference
        System.out.println("Length of inner array "+arrayOfArrayOfIntegers[2].length);//reference


        System.out.println(arrayOfArrayOfIntegers[2][4]);
    }
}
