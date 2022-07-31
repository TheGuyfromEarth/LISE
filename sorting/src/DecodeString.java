public class DecodeString {

    static int count=0;

    public static void main(String[] args) {
        String word = "1224"; 
        decodeString("",0,word);
        System.out.println(count);
    }

    private static void decodeString(String str,int n,String word){
        if(n == word.length())
        {
            count++;
            return;
        }
        if(word.charAt(n)!='0')
            decodeString(str+word.charAt(n),n+1,word);

        if(word.length()-n>=2) {
            String temp = "";
            temp += word.substring(n,n+2);
            int tempNum = Integer.parseInt(temp);
            if (tempNum >= 10 && tempNum <= 26)
                decodeString(str+word.charAt(n)+word.charAt(n+1),n+2,word);
        }
    }
}
