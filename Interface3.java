interface Client1{
    void walk();
}
interface Client2{
    void walk();
    void run();
}
class Human implements Client1,Client2{
    public void walk(){
        System.out.println("Chetan");
    }
    public void run() {
        System.out.println("Kanha");
    }
}
public class Interface3{
    public static void main(String[] args) {
        Human obj = new Human();
        obj. walk();
        obj.run();
    }
}


