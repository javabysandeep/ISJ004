package stringDemos.stringBuilderDemos;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("welcome");
        stringBuilder.insert(0,"Aplha ");
        stringBuilder.append(" beta");
        stringBuilder.append(100);
        System.out.println(stringBuilder.toString());
    }
}
