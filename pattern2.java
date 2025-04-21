import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = 4;
        int m = 5;

        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for hollow square
        // for(int i=0;i<n;i++) {
        //     for(int j=0;j<m;j++) {
        //         if(i==0 || i==3 || j==0 || j==4) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     } System.out.println();
        // }

        // for(int i=0;i<=n;i++) {
        //     for(int j=0;j<i;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // for(int i=n;i>=0;i--) {
        //     for(int j=0;j<=i;j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        //inverted half prymid
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // half pyramid with number
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }

        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=m-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }

        // int number = 1;
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum =i+j;
        //         if(sum % 2 == 0) {
        //             System.out.print("1"+" ");
        //         } else {
        //             System.out.print("0"+" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //BUTTERFLY PATTERN
        //uppper half
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (m-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 
        
        // //lower half
        // for(int i=m;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (m-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=m-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //hallow diameter
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=m-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==5 || j==1 || j==5){
        //             System.out.print("*");
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=m-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
   
        //diamond
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
