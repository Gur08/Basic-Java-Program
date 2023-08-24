package August22DataStructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //key / value pair
        Map<String ,String> map =new HashMap<>();
        map.put("name","John");
        map.put("email","John@gmail.com");
        map.put("car","Hyundai");
        System.out.println(map);
        map.put("null","52587954");
        System.out.println(map);
        map.put("null","587");
        System.out.println(map);
        // overwriting the variable
        // duplicate keys are not allowed
        // it's not in an order
        map.putIfAbsent("password","paswword"); // add if not present only
        System.out.println(map);
        map.putIfAbsent("password","pihdgh");
        System.out.println(map);
        System.out.println(map.get("name"));
    }
}
