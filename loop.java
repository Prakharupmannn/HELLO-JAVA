import java.util.Scanner;

public class loop{
public static void main(String args[]) {
    // for(int i=0;i<9;i++) {
    //     System.out.println(i+1);
    // }

    // int i=2;
    // while(i<10){
    //     System.out.println(i);
    //     i++;
    // }

    // for (int i=0;i<5;i++) {
    //     for(int j=5;j>=i;j--){
    //         System.out.print("*");
    //     } System.out.println();

        
    for (int i=0;i<5;i++) {
        for (int k=4;k>=i;k-- ) {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("*");
        } System.out.println();

        
    }
}
}