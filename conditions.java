import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // int age = sc.nextInt();
        // if (age>18) {
        //     System.out.println("Adult");
            
        // } else {
        //     System.out.println("not Adult");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        //     System.out.println("its equal");
            
        // } else if (a > b) {
        //     System.out.println("a is greater");
            
        // } else {
        //     System.out.println("a is lesser");
        // }
        
        int button = sc.nextInt();
        switch (button) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default: System.out.println("invalid button");
        }
    }
}
