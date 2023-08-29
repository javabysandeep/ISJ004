package classComponents.nestedClasses;

public class DatabaseConstants {
    static class Local {
        static class MySQl {
            public static String username = "Local Mysql Username";
            public static String password = "Local Mysql Password";
        }
    }

    static class Prod {
        static class MySQl {
            public static String username = "Prod Mysql Username";
            public static String password = "Prod Mysql Password";
        }
    }

    public static void main(String[] args) {
        System.out.println(DatabaseConstants.Local.MySQl.username);
        System.out.println(DatabaseConstants.Local.MySQl.password);

        System.out.println(DatabaseConstants.Prod.MySQl.username);
        System.out.println(DatabaseConstants.Prod.MySQl.password);
    }
}
