package java8Features.methodReference;

public class MethodReferenceInstanceMethods {
    public static void main(String[] args) {
        NumberProcessor numberProcessor = number -> number * number * number;
        System.out.println(numberProcessor.process(10));

        //method reference : instance method
        NumberUtility numberUtility = new NumberUtility();
        NumberProcessor reference = numberUtility::cube;
        System.out.println("Method reference "+reference.process(10));
    }
}
