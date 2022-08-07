import java.util.Scanner;

public class PrimeNumbers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while(testCases-- > 0){
            int n = input.nextInt();
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

    }
}