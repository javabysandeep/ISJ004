package stringDemos;

public class Demo1 {
    public static void main(String[] args) {
        char[] array = {'G', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'I', 'n', 'g'};
        System.out.println("Is array empty " + isEmpty(null));
        System.out.println("Array length " + length(array));
        System.out.println("Array element contains " + contains(array, 'G'));
        replace(array, 'G', 'g');
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }

    public static boolean isEmpty(char[] chars) {
        if (chars == null) {
            return true;
        }
        return chars.length == 0;
    }

    public static int length(char[] chars) {
        if (chars == null) {
            return -1;
        }
        return chars.length;
    }

    public static boolean contains(char[] chars, char inputChar) {
        if (chars == null) {
            return false;
        }
        boolean isPresent = false;

        for (char ch : chars) {
            if (ch == inputChar) {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }

    public static void replace(char[] chars, char oldCharacter, char newCharacter) {
        if (chars == null) {
            return;
        }
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == oldCharacter) {
                chars[index] = newCharacter;
            }
        }
    }

}
