package stringDemos.stringBuilderDemos;

public class Demo2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("welcome to string handling");
        //stringBuilder.reverse();
       // stringBuilder.delete(0,5);
        //stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder.indexOf("to"));
        System.out.println(stringBuilder.indexOf("g"));
        System.out.println(stringBuilder.lastIndexOf("g"));
        System.out.println(stringBuilder.toString());
        System.out.println("Capacity "+stringBuilder.capacity());
        System.out.println("Size "+stringBuilder.length());
    }
}
