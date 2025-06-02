import java.util.*;

class Student implements Comparable <Student>{
    int age;
    String name;

    public Student(int age , String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return age + " " + name;
    }
    public int compareTo(Student s) {
            return this.age-s.age;
        }
    }

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(11, "om"));
        list.add(new Student(23, "kanha"));
        list.add(new Student(6, "kajal"));
        Collections.sort(list);
        System.out.println(list);
    }
    
}
