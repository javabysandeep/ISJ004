package controlStatements.conditional.ifElseDemos;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2100;
        // leap year:2000, 2020,
        //not leap : 2100, 2023,

        if (year % 400 == 0
                ||
                (year % 100 != 0 && year % 4 == 0)
        ) {
            System.out.println("its a leap year " + year);
        } else {
            System.out.println("not a leap year " + year);
        }
    }
}
