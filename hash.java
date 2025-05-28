import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        String str = "programming"; //p=1;r=2;o=1
        HashMap<Character , Integer> map = new HashMap<>();
        char[] ch = str.toCharArray(); // too convert it into character array
        for(char i : ch){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
    }
}
