import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        // System.out.println("hello world");

    //by using for loop
    //    for(int counter = 0; counter < 10; counter++) {
    //     System.out.println(counter);
    //    }

    //    int i =0;
    //    while (i < 11) {
    //     System.out.println(i);
    //     i++;
    //    }

    // sum of n natural no.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // int sum = 0;
    // for(int i=0;i<=n;i++){
    //     sum = sum + i;
    // } 
    // System.out.println(sum);

    //for table
    for(int i=1;i<11;i++) {
        System.out.println(i*n);
    }   
    }
}

