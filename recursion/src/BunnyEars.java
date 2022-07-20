// Given N number of rabbits, return the total number of ears N rabbits would have.
// I/P -> N = 5;
// O/P -> 10

// Given N number of rabbits, return the total number of ears N rabbits would have.
// The Odd No bunny has 3 ears and the even No bunny has 2 ears.
// I/P -> N = 3;
// O/P -> 8 (3+2+3)

public class BunnyEars {
    public static void main(String[] args) {
        int N = 5;
//        System.out.println(bunnyEars(N));
        System.out.println(evenOddBunnyEars(N));
    }

    private static int bunnyEars(int N){
        if(N == 0)
            return 0;
        return bunnyEars(N-1)+2;
    }

    private static int evenOddBunnyEars(int N){
        if(N==0)
            return 0;

        if(N%2 == 1)
            return evenOddBunnyEars(N-1)+3;

        return evenOddBunnyEars(N-1)+2;
    }
}

// 5 bunnies
// bunnyEars(5) = bunnyEars(4) + 2
// bunnyEars(n) = bunnyEars(n-1)+2