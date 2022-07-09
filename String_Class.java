// Data Types
    // 1) Fundamental Data Types (Primitive) - 8
    // 2) User Defined Data Types (Non Primitive)

// Creation of object
    // ClassName objName = new ClassName();

// reference
// object

import java.util.Locale;

public class String_Class {

    public static void main(String[] args) {

        char ch = '*';

        String name = "Rishabh";
        String name1 = new String("Lisa");

        char[] chArr = {'v','a','r','u','n'};
        String name2 = new String(chArr);

//        System.out.println("The three musketeers :"+name+" "+name1+ " "+name2);

        String firstName = "Karen";
        String middleName = "M";
        String lastName = "Gill";

//        System.out.println(firstName+" "+lastName);

//        System.out.println(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName));

//        System.out.println(firstName.toLowerCase());
//        System.out.println(lastName.toUpperCase());

//        String username = " Rockstar1         ";
//        System.out.println(username.length());
//        System.out.println(username.trim().length());

        String compName = "Jack Parsley";
        String[] names = compName.split(" ");
        System.out.println(names[0]);
        System.out.println(names[1]);

//        String sentence = "Rise and Shine in the morning";
////        System.out.println(sentence.substring(0,14));
//        System.out.println(sentence.substring(sentence.indexOf('m')));

//        String word = "help";
//        System.out.println(word.substring(0,1)); // h
//        System.out.println(word);
        // String is an immutable class
    }
}

// Class
  // Variables
  // Functions