public class UniqueElement {

    public static void main(String[] args) {

        int[] arr = {11,2,2,99,78,78,99,5,10,10,11};
        int res = 0;

        for(int i: arr)
            res = (res^i);

        System.out.println(res);
    }
}
