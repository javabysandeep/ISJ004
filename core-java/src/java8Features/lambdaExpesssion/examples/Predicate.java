package java8Features.lambdaExpesssion.examples;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T input);

    public static void main(String[] args) {
        Predicate<Integer> predicate = number -> number % 2 == 0;
        System.out.println("Is number even " + predicate.test(10));

        Predicate<String> stringPredicate = str -> str.isEmpty();
        System.out.println(stringPredicate.test("it shaala"));

        Predicate<Float> floatPredicate = floatTypeInput -> floatTypeInput%2==0;
        System.out.println(floatPredicate.test(10.00f));
    }
}
