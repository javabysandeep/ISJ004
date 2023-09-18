package stringDemos;

public class Demo11Equality {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = "abc";
        // reference check ==
        System.out.println(str1 == str2);//false
        System.out.println(str2 == str3);//true

        //content  check : equals()
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str2.equals(str3));//true

        String str5 = "GOOD";
        String str6 = "good";
        System.out.println(str5 == str6);//false
        System.out.println(str5.equals(str6));//false
        System.out.println(str5.equalsIgnoreCase(str6));//true


    }
}
