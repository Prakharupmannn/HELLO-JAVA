interface Client1{
    void show();
}
interface Client2{
    void show();
    void print();
}
class Hello implements Client1,Client2{
    public void show(){
        System.out.println("Chetan");
    }
    public void print() {
        System.out.println("Kanha");
    }
}
public class Interface2{
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj. print();
        obj.show();
    }
}

