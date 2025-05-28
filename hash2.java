import java.util.HashMap;

public class hash2 {
    public static void main(String[] args) {
        String str1 = "programming is a fun and fun is a programming";
        HashMap<String,Integer> map = new HashMap<>();
        String[] strArray = str1.split(" ");
        for(String str : strArray ){
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        System.out.println(map);
    }
}
