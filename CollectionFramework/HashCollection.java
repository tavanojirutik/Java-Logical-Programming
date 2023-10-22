package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashCollection {
    public static void main(String[] args) {
        
        Map<String ,Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("Four", 4);

        // map.put("one", 100); // Override
        

        map.putIfAbsent("one", 100); //Avoid Override

        System.out.println(map);

        for(Map.Entry<String , Integer> e: map.entrySet()){

            System.out.println(e); //Finding The Entry

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(map.containsKey(4));
    }
}
