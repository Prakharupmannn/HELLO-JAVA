import java.util.ArrayList;
public class getsetarr {
    public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
        // arr.add("om");
        // arr.add("sambhav");
        // arr.add("allah");
        // arr.add(0, "CHETAN");
        // arr.add(3, "kanha");
        // System.out.println(arr);
        // System.out.println(arr.get(2));
        // System.out.println(arr.get(3)); 
        
        //dynamic subarray

        arr.add("2"); 
        arr.add("-7");  
        arr.add("0"); 
        arr.add("5");
        arr.add("6");
        arr.add("-3");
        arr.add("0");
        arr.add("7");
        System.out.println(arr);
        System.out.println(arr.get(4));
        System.out.println(arr.get(1));
        System.out.println(arr.set(7, "9"));
    }   
}
