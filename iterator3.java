import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.xml.crypto.Data;

public class iterator3 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Kanha");
        str.add("om");
        str.add("Rohit");
        str.add("mohit");
        str.add("sambhav");
        System.out.println(str);
        ListIterator<String> it = str.listIterator();
        while(it.hasNext()){
            String data = it.next();
        
        if(data.length() < 3) {
            data = "hello";
            it.set("hello");
        }  System.out.println(data);
    }System.out.println(" " + " heeheeheeehee");
    int count = 0 ;
    while(it.hasPrevious()){
            String data = it.previous();
            count ++;
            if(count != str.size()) {   
                it.set("hello"); 
            }
    }System.out.println(str.size());
    System.out.println(str);
}
}
