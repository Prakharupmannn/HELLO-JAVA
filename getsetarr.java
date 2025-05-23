import java.util.ArrayList;
public class getsetarr {
    public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
        arr.add("om");
        arr.add("sambhav");
        arr.add("allah");
        arr.add(0, "CHETAN");
        arr.add(3, "kanha");
        System.out.println(arr);
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));   
    }   
}
