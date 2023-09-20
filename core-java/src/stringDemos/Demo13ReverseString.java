package stringDemos;

public class Demo13ReverseString {
    public static void main(String[] args) {
        String str = "good morning";
        //way 1 : only printing in reverser order
        for (int index = str.length() - 1; index >= 0; index--) {
            System.out.print(str.charAt(index));
        }
        //way 2 : take another string
        String reverse = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            reverse = reverse + str.charAt(index);
        }
        System.out.println("\nReverse String : " + reverse);

        // way 3 : character array
        char[] charArray = new char[str.length()];

        for (int index = str.length() - 1, temp = 0; index >= 0; index--, temp++) {
            charArray[temp] = str.charAt(index);
        }
        String reverse2 = new String(charArray);
        System.out.println(reverse2);




    }
}
