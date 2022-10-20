// Run Length Encoding

public class StringCompression {

    public static void main(String[] args) {
        String input = "akkkkeennnnnnnnnjaaaaaaaqqqqqq";
        // output = akenjamwopq
        // output1 = ak4e2n9ja7q6
//        System.out.println(compressString(input));
        System.out.println(compressStringUsingRunLengthEncoding(input));
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            char currentCh = str.charAt(i);
            char prevCh = str.charAt(i - 1);
            if (currentCh != prevCh)
                sb.append(currentCh);
        }
        return sb.toString();
    }

    public static String compressStringUsingRunLengthEncoding(String str) {
        StringBuilder sb = new StringBuilder();
        if(str!=null)
            sb.append(str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char currentCh = str.charAt(i);
            char prevCh = str.charAt(i - 1);
            if (currentCh != prevCh) {
                if(count>1)
                    sb.append(count);
                sb.append(currentCh);
                count = 1;
            }else{
                count++;
            }
        }
        if(count>1)
            sb.append(count);
        return sb.toString();
    }
}