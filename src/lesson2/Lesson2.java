package lesson2;

import java.util.HashMap;
import java.util.Map;

public class Lesson2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap <>();

        map.put(1,"jeden");
        map.put(2, "dwa");
        map.put(3,"trzy");
        

        for(Map.Entry<Integer, String> m : map.entrySet()){
            int key = m.getKey();
            String value = m.getValue();

            System.out.println(key + ":" + value);
        }
    }
}
