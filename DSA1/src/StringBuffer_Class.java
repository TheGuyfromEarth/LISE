
public class StringBuffer_Class {

    public static void main(String[] args) {

//        String s = new String("Kite");
//        s.concat(" in the sky");
//        System.out.println(s);

        StringBuffer sb = new StringBuffer("Kite");
        sb.append(" in the sky");
//        System.out.println(sb);
//
//        sb.reverse();
//        System.out.println(sb);

//        sb.delete(sb.lastIndexOf("t"),sb.indexOf("s"));
//        System.out.println(sb);

//        StringBuilder sb1 = new StringBuilder("Japan");
//        sb1.replace(3,5,"zz");
//        System.out.println(sb1);

        StringBuilder mySb = new StringBuilder("Korea");
        StringBuilder yourSb = new StringBuilder("Korea");

        System.out.println(mySb == yourSb); //false
        System.out.println(mySb.equals(yourSb));//false

    }
}
