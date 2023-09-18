package stringDemos;

public class Demo10StringMethods {
    public static void main(String[] args) {
        String str = "greetings of the day";
        System.out.println(str.startsWith("greet"));
        System.out.println(str.startsWith("ddd"));
        System.out.println(str.endsWith("day"));

        System.out.println(str.contains("day"));

        String str1 = "good";
        String str2 = " morning";
        String concat = str1.concat(str2);
        System.out.println(concat);

        String s = str1 + str2;
        System.out.println("string concatenation using + operator "+s);

        String str3 = "content is the king";
        String str4 = "content is the king";

        System.out.println(str3==str4);

    }
}
