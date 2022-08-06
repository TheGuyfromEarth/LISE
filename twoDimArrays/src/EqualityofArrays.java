public class EqualityofArrays {

    public static void main(String[] args) {

        int[] array = {12,22,33,44,11};

        int[][] arr1 = {{10,20,30},
                        {20,10,40},
                        {40, 0,50}};

        int[][] arr3 = arr1; // shallow copy

        int[][] arr2 = {{10,20,30},
                        {20,10,40},
                        {40, 0,50}};

        boolean flag = true;

        if(arr1.length == arr2.length && arr1[1].length == arr2[1].length){
            for(int i=0;i< arr1.length;i++){
                for (int j = 0; j<arr1[0].length;j++)
                {
                    if(arr1[i][j] != arr2[i][j])
                    {
                        flag = false;
                    }
                }
                if(!flag)
                    break;
            }
        }else
            flag = false;

        if(flag)
            System.out.println("Equal");
        else
            System.out.println("Unequal");

        // check if given two matrix are equal
//        if(arr1.equals(arr2))
//            System.out.println("Equal");
//        else
//            System.out.println("Unequal");
    }

}
