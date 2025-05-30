import java.util.ArrayList;
import java.util.ListIterator;

public class iterator2 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Rahul");
        str.add("om");
        str.add("Rohit");
        str.add("mohit");
        str.add("kanha");
        System.out.println(str);
        ListIterator<String> it = str.listIterator();// listIterartor is basically 2Dm which basicall-y moves from forward-back and vice versa
        while(it.hasNext()){
            String data = it.next();
            System.out.println(data);
        }
        System.out.println( " " + "gap in between");
        while(it.hasPrevious()){
            String Prevdata = it.previous();
            System.out.println(Prevdata);
        }
    }
}
