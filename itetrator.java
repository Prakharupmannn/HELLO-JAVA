import java.util.ArrayList;
import java.util.Iterator;

public class itetrator {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Rahul");
        str.add("om");
        str.add("Rohit");
        str.add("mohit");
        str.add("kanha");
        System.out.println(str);
        Iterator<String> it = str.iterator();
        //System.out.println(it.hasNext());
        while (it.hasNext()) {
            String data = it.next();
            if(data.startsWith("R")) {
                it.remove();
            }
        }
        System.out.println(str);
    }
}
