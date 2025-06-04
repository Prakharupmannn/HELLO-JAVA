class Myrunable implements Runnable {
    public void run() {
        System.out.println("Threads are Runable interface");
    }
}
public class Multithreading3 {
    public static void main(String[] args) {
        Myrunable obj = new Myrunable();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            
        }
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }
        System.out.println("Main Thread Is Running");
    }
}