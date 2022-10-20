public class ToggleCases {

    public static void main(String[] args) {
        String str = "The 1 BIG BroWN FoX";
        System.out.println(toggleCases(str));
    }

    public static String toggleCases(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                sb.append((char)(ch + 'a' - 'A'));
            }else if(ch >= 'a' && ch<= 'z'){
                sb.append((char)(ch + 'A' - 'a'));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
