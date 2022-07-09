// I/P -> racecar
// O/P -> true

public class isPalindrome {

    public static void main(String[] args) {

        String word = "racecar";
//        System.out.println(isPalindrome(word));
        System.out.println(isPalindromeBetter(word));
    }

    private static boolean isPalindrome(String word){ // racecar
        String revWord = "";

        for(int i = word.length()-1; i>=0; i--){
            revWord += word.charAt(i);
        }

        if(word.equals(revWord))
            return true;

        return false;
    }

    private static boolean isPalindromeBetter(String word){ // racecar
        int front = 0;
        int rear = word.length()-1;

        while(front<rear){
            if(word.charAt(front)!=(word.charAt(rear)))
                return false;

            front++;
            rear--;
        }
        return true;
    }


}
