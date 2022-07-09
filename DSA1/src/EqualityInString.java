public class EqualityInString {

    public static void main(String[] args) {

        String str2 = "Baseball";
        String str3 = new String("Baseball");

        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));

    }
}
