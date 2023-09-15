package array;

public class Demo9ArrayElementSearchLinearSearch {
    public static void main(String[] args) {
        int[] array = {11, 34, 21, 56, 88};
        int key = 56;
        boolean isPresent = false;
        for (int index = 0; index < array.length; index++) {
            if (key == array[index]) {
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent ? "Its found" : "not found");
    }
}
