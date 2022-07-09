// Given a String, reverse and return the String.

// Ex: I/P -> "Game"
// O/P -> emaG

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String revWord = ""; // by default value of STring is null. Here, we initialise
        // revWord with empty String

        for(int i = word.length()-1; i>=0; i--){
//           revWord = revWord + word.charAt(i);
           revWord += word.charAt(i);
        }
        System.out.println(revWord);
    }


}
