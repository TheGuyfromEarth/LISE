// I/P:
// 4
// Australia NewZealand
// SouthAfrica USA
// NewZealand SouthAfrica
// India Australia

// O/P ->  India -> Australia -> NewZealand -> SouthAfrica -> USA

import java.util.*;

public class TravelDestinations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int count = inp.nextInt();
        Map<String, String> travelMap = new HashMap<>();

        while (count-- > 0) {
            String srcDest = inp.next();
            String nextDest = inp.next();
            travelMap.put(srcDest, nextDest);
        }
        System.out.println(travelMap);
        printTravelChart(travelMap);
    }

    public static void printTravelChart(Map<String, String> travelMap) {
        // finding starting point
        Set<String> srcSet = travelMap.keySet();
        Collection<String> destSet =  travelMap.values();

        String stPoint = "";
        for (String currDest : srcSet) {
            if (!destSet.contains(currDest)) {
                stPoint += currDest;
                break;
            }
        }

        // print the destinations
        String temp = stPoint; // Ind
        while (true) {
            System.out.print(temp + " ");
            if (travelMap.containsKey(travelMap.get(temp))) {
                temp = travelMap.get(temp);
            } else {
                System.out.println(travelMap.get(temp));
                break;
            }
        }
    }
}
