interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("vechile is starting");
    }
}
public class Interface6{
    public static void main(String[] args) {
        Car obj = new Car();
        obj. start();
    }
}

