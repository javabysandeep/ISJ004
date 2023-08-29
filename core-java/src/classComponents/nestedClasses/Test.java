package classComponents.nestedClasses;

public class Test {
    public static void main(String[] args) {
        System.out.println(DatabaseConstants.Local.MySQl.username);
        System.out.println(DatabaseConstants.Local.MySQl.password);

        System.out.println(DatabaseConstants.Prod.MySQl.username);
        System.out.println(DatabaseConstants.Prod.MySQl.password);

        System.out.println();
    }
}
