package dynamicProgramming;

import java.io.*;

public class KnapSack01_Optimized {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.parseInt(br.readLine());
        while(T-->0){
            int N =Integer.parseInt(br.readLine());
            int cap = Integer.parseInt(br.readLine());
            String []valueStr = br.readLine().split(" ");
            int [] v = new int [N];
            for(int i =0; i<N; i++){
                v[i]=Integer.parseInt(valueStr[i]);
            }
            String [] weightStr= br.readLine().split(" ");
            int [] w = new int [N];
            for(int i =0; i<N;i++){
                w[i]=Integer.parseInt(weightStr[i]);
            }
            int[] prevDp = new int[cap + 1];
            int[] currDp = new int[cap + 1];
            System.out.println(maxCost(w, v, prevDp, currDp));
        }
    }

    public static int maxCost(int[] weights, int[] values,int[] prevDp,int[] currDp) {
        int[] temp;
        for (int i = 0; i < weights.length; i++) {
            for (int cap = 0; cap < prevDp.length; cap++) {
                if (cap >= weights[i]) {
                    int remainingWeight = cap - weights[i];
                    if (remainingWeight >= 0) {
                        currDp[cap] = Math.max(values[i] + prevDp[remainingWeight], prevDp[cap]);
                    } else
                        currDp[cap] = prevDp[cap];
                } else
                    currDp[cap] = prevDp[cap];
            }
            // update array references

            temp = prevDp;
            prevDp = currDp;
            currDp = temp;
        }
        return prevDp[prevDp.length-1];
    }
}