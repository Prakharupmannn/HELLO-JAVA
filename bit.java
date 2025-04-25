import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;//0101 
        int pos = 1;
        //int bitmask = 1<<pos;

        // if((bitmask & n) == 0) {  //for set bit
        //     System.out.println("bit was zero");
        // } else{
        //     System.out.println("bit was one");
        // }

        // int newNumber = bitmask | n;  // for get bit
        // System.out.println(newNumber);

        // int notbitmask = ~(bitmask);   // for clear bit
        // int newNumber =notbitmask & n;
        // System.out.println(newNumber);

        int bitmask = 1<<pos;
        if(oper == 1) {  
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else{
            int newbitmask = ~(bitmask);
            int newNumber = newbitmask & n;
            System.out.println();
        }
      

    }
}
