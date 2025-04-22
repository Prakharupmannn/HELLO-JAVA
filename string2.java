import java.util.Scanner;

public class string2 {
    public static void main(String[] args) {
        System.out.println("Enter a name : ");
        Scanner ch = new Scanner(System.in); 
        char v = ch.next().charAt(0);
        switch (v) {
            case 'a':
            case 'e':    
            case 'i':
            case 'o':
            case 'u':
            System.out.println("its a vowel");
             break;

             default :
             System.out.println("its a consonent");
        }
          
    }
}
