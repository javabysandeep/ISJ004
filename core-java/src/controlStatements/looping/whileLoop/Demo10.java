package controlStatements.looping.whileLoop;

public class Demo10 {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        while (i > j) {
            System.out.println(i + "\t" + j);
            i--;
            j++;
        }
        //i  j
        //10 5
        //9 6
        //8 7
    }
}
