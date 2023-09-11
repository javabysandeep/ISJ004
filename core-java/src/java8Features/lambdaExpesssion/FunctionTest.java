package java8Features.lambdaExpesssion;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (input) -> input * input;
        System.out.println("Square "+function.apply(10));

        Function<Integer, Integer> cube = (input) -> input * input * input;
        System.out.println("Cube "+cube.apply(10));

        Function<String, Integer> stringLength = string-> string.length();
        System.out.println("String length "+stringLength.apply("sandeep"));
    }
}
