package assignments.operator;

public class ConditionalOperatorAlphabet {
    public static void main(String[] args) {
        char ch = 'Z';
        System.out.println(
                ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                        ? "its alphabet"
                        : "its not alphabet"
        );
    }
}
