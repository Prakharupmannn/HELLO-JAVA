public class recursion2 {
    public static void towerofhanoi(int n, String scr, String helper, String dest) {
       if(n == 1) {
           System.out.println("transfer disk" + n + " from " + scr + " to " + dest);
           return;
       }
       towerofhanoi(n-1, scr, dest , helper); 
       System.out.println("transfer disk" + n + " from " + scr + " to " + dest);
       towerofhanoi(n-1, helper, scr, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, "S", "H", "D");
    }
}
