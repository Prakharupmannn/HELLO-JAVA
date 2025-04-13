import java.util.Scanner;

public class calculator {
    public static void main(String arg[] ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = in.nextInt();
        System.out.println("enter your second number");
        int b = in.nextInt();
        System.out.println("Enter your command");
        char c=in.next().charAt(0);

        switch(c) {
            case '+' : 
            System.out.println(a+b);    
            break;
            case '-' :
            System.out.println(a-b);
            break;
            case '*' :
            System.out.println(a*b);
            break;
            case '/' :
            System.out.println(a/b);
            break;
            case '%' :
            System.out.println(a%b);
            break;
            default:
            System.out.println("Invalid Input");
                
        } 
    }
}
