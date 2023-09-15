package java8Features.methodReference;

public interface I<T> {
    void display(T t);

    public static void main(String[] args) {
        //lambda expression
        I<String> i = (input) -> System.out.println(input);
        i.display("good morning");

        //method reference
        I<String> i2 = System.out::println;
        i2.display("good morning using method reference");

    }
}
