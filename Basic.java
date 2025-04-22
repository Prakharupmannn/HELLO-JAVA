import java.util.Scanner;

public class Basic{

    public static void main(String args[] ) {
     
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     if(a>b && a>c){
    //         System.out.println("A is greater");
    //     } else if(b>a && b>c){
    //         System.out.println("B is greater");
    //     } else{
    //         System.out.println("C is greater");
    //     }
       
    // }


//  public static void main (String args[] ){
//     Scanner sc = new Scanner(System.in);
//     char q = sc.next().charAt(index:0);
//     if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u') {
//         System.out.println("its a vowel")
//     } else{
//         System.out.println("its a consonent")
//     }

// }


//question no. 1
// public static void main(String args[]) { 
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter any number");
//     int a = sc.nextInt();
//     if (a%2 == 0) {
//         System.out.println("number is even");     
//     } else {
//         System.out.println("number is odd");
//     }

// } 

//question no 2
// public static void main(String args[]) { 
//     public static void main(String args[]) { 
//     System.out.println("enter any number");
//     int a = sc.nextInt();
//     if (a==0) {
//         System.out.println("enter number is zero");
        
//     }  else if (a<0) {
//         System.out.println("enter number is negative");
//     } 
//     else {
//         System.out.println("enter number is positive");
//     }
        
//     }

//question no 3

// public static void main(String args[]) { 
//     Scanner in = new Scanner(System.in); 
//     System.out.println("enter first number");  
//     int a = in.nextInt();
//     System.out.println("enter second number");
//     int b = in.nextInt();
//     if (a>b) {
//         System.out.println("enter a is greater");
        
//     }
//     else{
//         System.out.println("enter b is greater");
//     }
// }
// }

//question no 4

//  System.out.println("enter a character: ");
//     Scanner ch = new Scanner(System.in); 
//     char v = ch.next().charAt(0);

//     switch (v) {
//         case 'a':
//         case 'e':
//         case 'i':
//         case 'o':
//         case 'u':

//         System.out.println("its a vowel");    
//             break;
    
//         default:
//         System.out.println("its a consonent");
//     }

//question no 5

// System.out.println("enter a number : ");
// Scanner in = new Scanner(System.in);
// int N = in.nextInt();

// for(int i=1;i<N;i++){
//     System.out.println(i);
// }


        int n = 1234;
        for(int i=0;i<4;i++){ 
            int a=n/10;
            if(n%2==0) {
                System.out.println("its even" + a);
            } else{
                System.out.println("its odd" + a);
            }
           n=n/10;
        }
    }
}   


