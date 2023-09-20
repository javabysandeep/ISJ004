package stringDemos;

public class Demo12SplitToCharArray {
    public static void main(String[] args) {
        String str = "welcome to String handling session";
        String[] stringArray = str.split(" ");
        for (String temp : stringArray) {
            System.out.println(temp);
        }

        String names = "Vaibhav,Akshay,Tohid,Pratik";
        String[] nameArray = names.split(",");
        for (String name : nameArray) {
            System.out.println(name);
        }

        String string = "welcome to String handling session";
        char[] charArray = string.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch);
        }
        //System.out.println('a' > 'A');

        System.out.println("a".compareTo("a"));
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));

    }
}
