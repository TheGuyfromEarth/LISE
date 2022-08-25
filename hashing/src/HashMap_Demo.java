import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

    public static void main(String[] args) {

        // create a hashmap for storing countries and capitals
        HashMap<String, String> atlas = new HashMap<>();
        atlas.put("USA", "DC");
        atlas.put("Brazil", "Rio");
        atlas.put("India", "New Delhi");
        atlas.put("India", "Mumbai");
        atlas.put("Nepal","Mumbai");
        System.out.println(atlas);

        Set<String> countrySet = atlas.keySet();
        for(String cntry: countrySet){
            System.out.println(cntry +" "+ atlas.get(cntry));
        }

        atlas.values();

       for(Map.Entry<String,String> mapObj : atlas.entrySet()){
           System.out.println(mapObj.getKey()+" "+mapObj.getValue());
       }
    }
}

// Collision Resolution Methods
// 1) Open Hashing -> Chaining
// 2) Closed Hashing
    // 2a) Linear Probing (h(i)+k)modN
    // 2b) Quardratic Probing (h(i)+k^2)modN
    // 2c) Double Hashing (two hash functions)