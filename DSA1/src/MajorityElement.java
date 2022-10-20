
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,3,9,9};
        // Moore's Voting Algorithm
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr){
        int num = arr[0];
        int count = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] == num){
                count++;
            }else{
                count--;
                if(count == 0)
                {
                    num = arr[i];
                    count = 1;
                }
            }
        }
        if(count!=0) {
            if(checkFreq(arr, num) == num)
                return num;
        }

        return -1;
    }

    private static int checkFreq(int[] arr, int num){
        int freq = 0;
        for (int i = 0; i<arr.length;i++){
            if(num == arr[i])
                freq++;
        }
        if(freq> arr.length/2)
            return num;
        return -1;
    }
}
