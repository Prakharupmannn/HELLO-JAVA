    interface Animal{
    void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("bark bark");
    }
}
public class Interface5{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj. makeSound();
    }
}


