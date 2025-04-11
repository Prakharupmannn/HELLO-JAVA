import java.util.Scanner;

public class Basic{

    // public static void main(String args[] ) {
     
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();

    //     if(a>b && a>c){
    //         System.out.println(x:"A is greater");
    //     } else if(b>a && b>c){
    //         System.out.println(x:"B is greater");
    //     } else{
    //         System.out.println(x:"C is greater");
    //     }
       
    // }
 public static void main (String args[] ){
    Scanner sc = new Scanner(System.in);
    char q = sc.next().charAt(20);
    if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u') {
        System.out.println("its a vowel")
    } else{
        System.out.println("its a consonent")
    }


}


    
}

