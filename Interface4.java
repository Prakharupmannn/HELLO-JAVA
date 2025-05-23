interface A{
    void display();
}
interface B{
    void display();
}
class Demo implements A,B{
    public void display(){
        System.out.println("Chetan");
    }
}
public class Interface4{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj. display();
    }
}
