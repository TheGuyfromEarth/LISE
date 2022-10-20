public class StringDiff {

    public static void main(String[] args) {
        String str = "cide";
        // output = c6i-5d1e
        System.out.println(stringDiff(str));
    }

    public static String stringDiff(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char currentCh = str.charAt(i);
            char prevCh = str.charAt(i-1);
            int diff = currentCh - prevCh;
            sb.append(diff);
            sb.append(currentCh);
        }
        return sb.toString();
    }
}

// newtonSchool@gmail.com

// [a-zA-Z0-9]*[@]{1}[a-z]*(.com||.in||.co||.co.in)