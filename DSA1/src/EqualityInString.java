public class EqualityInString {

    public static void main(String[] args) {

        String str1 = "BaseBall";
        String str2 = "Denmark";
        String str3 = new String("Baseball");

//        System.out.println(str2 == str3);
//        System.out.println(str2.equals(str3));
//        System.out.println(str1.compareToIgnoreCase(str2));

        String num1 = "two";
        String num2 = "TWO";

        System.out.println(num1.equals(num2));
    }
}
