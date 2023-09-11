package java8Features.lambdaExpesssion;

public class Addition<U, V> {
    void add(U u, V v) {
        System.out.println(u + "\t" + v);
    }

    public static void main(String[] args) {
        Addition<Integer, Integer> i1 = new Addition<>();
        i1.add(10, 20);

        Addition<Float, Float> i2 = new Addition<>();
        i2.add(10.5f, 20.0f);

        Addition<String, String> i3 = new Addition<>();
        i3.add("abc", "xyz");

        Addition<Integer, String> i4 = new Addition<>();
        i4.add(10, "abc");
    }
}
