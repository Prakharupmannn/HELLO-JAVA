import java.security.Key;
import java.util.HashMap;

public class setmap {
    public static void main(String[] args) {
        // HashMap<String , Integer> map = new HashMap<>();
        // map.put("id1", 1);
        // map.put("id2", 2);
        // map.put("id3", 3);
        // map.remove("id3", 3);// to remove a hash map function
        // System.out.println(map);
        // System.out.println(map.get("id2"));
        // System.out.println(map.containsValue(1));
        // for(String key : map.keySet()) {
        //     System.out.println(key);
        // }

        // HashMap<Integer , Integer> map = new HashMap<>();
        // map.put(1, 3);
        // map.put(2, 4);
        // map.put(3, 5);
        // map.put(5, 9);
        // map.forEach((key,value) -> {
        //     if(key>2)
        //     System.out.println(key + " " + value);
        // });   

        HashMap<Integer , String> map = new HashMap<>();
        map.put(1, "My");
        map.put(2, "name");
        map.put(3, "is");
        map.put(4, "Tiwari");
        map.forEach((key,value) -> {
            if(key>3)
            System.out.println(key + " " + value);
    });
    }
}
