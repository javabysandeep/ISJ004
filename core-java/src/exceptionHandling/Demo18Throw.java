package exceptionHandling;

import java.io.FileNotFoundException;

public class Demo18Throw {
    public static void main(String[] args) {
        //System.out.println(10/0);
//        throw  new ArithmeticException("/ by zero");
        try {
            readFile("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file name");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
