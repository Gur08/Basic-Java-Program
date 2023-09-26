package HashmapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Employee> set = new HashSet<Employee>();
        set.add(new Employee("Gur","Singh"));
        set.add(new Employee("Gur","Singh"));
        set.add(new Employee("Gur","Singh"));
// in above if i print it will have 3 same values bc 3 different objects are created , it have different address
        // so that's why it's printing three times

        System.out.println(set);

        Map<Employee,String> map = new HashMap<Employee, String>();
        map.put(new Employee("Gur","Singh"),"Sales");
        map.put(new Employee("Sahota","Singh"),"Engineer");
        map.put(new Employee("Dil","Singh"),"Accountant");
        map.put(new Employee("Gur","Singh"),"R&D");
        Set<Map.Entry<Employee, String>> entries = map.entrySet();
        for (Map.Entry<Employee, String> s:entries) {
            System.out.println(s);
        }
    }
}
