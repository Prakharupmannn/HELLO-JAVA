import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<Boolean> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();

        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements 
        int elements = list.get(0);
        System.out.println(elements);
        //System.out.println(list.get(1));

        //add any elements in between
        list.add(1, 5);
        System.out.println(list);

        //set
        list.set(0, 6);
        System.out.println(list);

        //delete 
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
