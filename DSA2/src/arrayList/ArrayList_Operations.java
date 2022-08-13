package arrayList;

import java.util.ArrayList;

public class ArrayList_Operations {

    public static void main(String[] args) {

        ArrayList<Double> heightList = new ArrayList<>();

        heightList.add(170.0);
        heightList.add(172.5);
        heightList.add(165.5);
        heightList.add(180.0);

//        for(int i=0;i< heightList.size();i++)
//            System.out.println(heightList.get(i));

        // enhanced for loop (for-each)
//        for(double xyz : heightList)
//            System.out.println(xyz);

        heightList.set(2,167.5);

        heightList.remove(1);
        heightList.remove(180.0);

        heightList.clear();
        System.out.println(heightList.isEmpty());


        System.out.println(heightList);
    }
}
