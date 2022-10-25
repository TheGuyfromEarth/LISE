// 5 2 3 6 4 1 (digits)
// 6 5 4 3 2 1 (position)

// 3 6 2 4 5 1 (digits)
// 6 5 4 3 2 1 (position)

// I/P -> 4132

// 4 1 3 2 (digits)
// 4 3 2 1 (position)

// O/P -> 4 2 1 3
// 4213

import java.util.Arrays;

public class InverseOfNumber {
    public static void main(String[] args) {
        int num = 523641;
        inverseNum(num);
    }

    public static void inverseNum(int num){
        int temp = num;
        int count = 0;

        while(temp!=0){
            count++;
            temp = temp/10;
        }

        int[] arr = new int[count+1];
        int i = 1;

        while(num!=0){
            arr[i] = num%10;
            num = num/10;
            i++;
        }
        // value  0 4 1 3 2
        // index  0 1 2 3 4
        // pos    0 4 3 2 1

        int[] aux = new int[arr.length];

        int j = arr.length-1;
        i = 1;

        for(;i< arr.length;i++){
            aux[arr[j]] = j;
            j--;
        }

        int res = 0;
        int power = aux.length-2;
        for(int k = aux.length-1;k>=1;k--){
            res += aux[k]*Math.pow(10,power);
            power--;
        }
        System.out.println(res);

    }
}
