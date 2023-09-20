package stringDemos.stringBuilderDemos;

public class Demo3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(10);
        System.out.println("Capacity " + stringBuilder.capacity());
        System.out.println("Size " + stringBuilder.length());

    }
}
