// Immutable class : Once an object is created, the value of that object cannot be changes,
// and if somebody tries to change the value, then a new object will be created with that value.

import java.util.Scanner;

public class Immutability {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.toUpperCase();
        System.out.println(str);

    }
}
