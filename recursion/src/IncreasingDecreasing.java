// Given a value for N, print the Decreasing values till 1 and then the increasing values till N.

// Ex: N = 5
// O/P: 5,4,3,2,1,1,2,3,4,5

public class IncreasingDecreasing {
    public static void main(String[] args) {
        int N = 4;
        decreasingIncreasing(N);

        System.out.println("End of code");
    }

    private static void decreasingIncreasing(int N){ // 3
        if(N==0)
            return;
        // pre call area // 3 2 1
        System.out.println(N);
        decreasingIncreasing(N-1);
        // post call area // 1 2 3
        System.out.println(N);
    }
}
