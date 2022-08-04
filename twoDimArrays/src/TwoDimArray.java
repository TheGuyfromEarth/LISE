import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray {

    public static void main(String[] args) {

        int[] arr = new int[10];

        int[][] marks;

        marks = new int[2][3];

        // there are two students for whom, I need to store their marks in 3 subjects

        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) { // 0,1
            for(int j=0;j< marks[i].length;j++){ // 0,1,2
                marks[i][j] = inp.nextInt();
            }
        }

        for(int i=0;i< marks.length;i++)
            System.out.println(Arrays.toString(marks[i]));

//        for (int i = 0; i < marks.length; i++) { // 0,1
//            for(int j=0;j< marks[i].length;j++){ // 0,1,2
//                System.out.print(marks[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
