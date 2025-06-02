import java.util.*;
import java.util.Comparator;

class Student {
    int RollN;
    int age;
    String name;

    public Student(int RollN, int age , String name) {
        this.RollN = RollN;
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return RollN+ " " +age+ " " +name;
    }
}
class sortByName implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class sortByRollN implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.RollN - s2.RollN;
    }
}


public class Comparator2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, 15, "om"));
        list.add(new Student(7, 17, "kanha"));
        list.add(new Student(10, 20, "chetan"));
        Collections.sort(list,new sortByName());
        //Collections.sort(list,new sortByRollN());
        //System.out.println(list);
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }
}
