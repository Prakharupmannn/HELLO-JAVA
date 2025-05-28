import java.util.HashMap;

public class hash3 {
    public static void main(String[] args) {
        String str = "aaabcccdddeeef";
        HashMap<Character , Integer> map = new HashMap<>();
        char[] ch = str.toCharArray(); // too convert it into character array
        for(char i : ch){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(char i : map.keySet()){
            if(map.get(i)==1) {
                System.out.println(i);
                break; 
    }            
}
}
}
