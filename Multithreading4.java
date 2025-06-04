class Withdrawl extends Thread{
  static  int TotalBalance = 1000; 
    int amount;
    public Withdrawl(int amount) {
        
        this.amount=amount;
        System.out.println("Welcome to SBI bank");
    }
     
    public void run() {
        synchronized (Withdrawl.class){//to solve a problem we used synchronized
        if(TotalBalance>=amount) {
            System.out.println("is going to withdrawl" + " " + amount);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            } 
            TotalBalance-=amount;
            System.out.println("Remaining money" + " " + TotalBalance);
        }
        else{
            System.out.println("low balance" );
        }
    }
}
}

public class Multithreading4 {
    public static void main(String[] args) {
       
        Withdrawl t2 = new Withdrawl(300);
        Withdrawl t1 = new Withdrawl(1000);
      
        t2.start();
        t1.start();
    }
}
