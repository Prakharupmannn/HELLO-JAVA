import java.util.TreeSet;

public class contain {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,5};
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : arr) {
            if(set.contains(i)) {
                System.out.println(i);   //if its contain an elements then itprint true else it will print false
                break;
            } else{
                set.add(arr[i]);
            }
        }
    }
}
