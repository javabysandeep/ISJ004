package java8Features.methodReference;

public interface NumberProcessor {
    int process(int number);

    public static void main(String[] args) {
        //Lambda expression
        NumberProcessor numberProcessor = number -> number * number;
        System.out.println(numberProcessor.process(10));

        //Method reference
        NumberProcessor reference = NumberUtility::square;
        System.out.println(reference.process(10));
    }
}
