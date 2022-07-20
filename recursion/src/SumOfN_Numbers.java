// Sum of first N Natural Numbers
// EX: I/P -> N = 10
// O/P -> 55

public class SumOfN_Numbers {

    public static void main(String[] args) {
        int N = 4;
        int sum = 0;

//        for(int i=1; i<=N;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
        System.out.println(sum(N));

    }

    private static int sum(int N) {
        // base case
        if (N == 1)
            return 1;

        return sum(N - 1) + N;
    }
}

// sum(3) = 3 + 3
// sum(2) = 1 + 2
// sum(1) = 1



// sum(5) = sum(4) + 5
// sum(N) = sum(N-1)+N
