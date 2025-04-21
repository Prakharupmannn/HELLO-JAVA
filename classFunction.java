import java.util.Scanner;

public class classFunction {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return ;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
    //     printMyName(name);
    // }


    // public static int calculateSum(int a , int b){
    //     int sum = a + b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculateSum(a, b);
    //     System.out.println("sum of 2 numbers is : " + sum);
    // }


    // public static int calculateProduct(int a , int b){
    //     int product = a * b;
    //     return product;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int product = calculateProduct(a, b);
    //     System.out.println("Product of 2 numbers is : " + product);
    // }


//     public static void printFactorial(int n){
//         if (n<0) {
//             System.out.println("Invalid Input");
//             return;
//         }
//         int factorial = 1;
//         for(int i=n;i>=1;i--){
//             factorial = factorial * i;    
//         }
//         System.out.println(factorial);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printFactorial(n);

//     }


    // public static int gcd(int a , int b) {
    //     while (b != 0) {
    //         int temp = b;
    //         b = a%b;
    //         a = temp;       
    //     }
    //     return a;
    // }
    // public static void main(String[] args) {
    //     int num1 = 36;
    //     int num2 = 60;

    //     int result = gcd(num1 , num2);
    //     System.out.println("GCD of num1 and num2 is : " + num1 + num2  + " " + result  );
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms (n) : ");
        int n = sc.nextInt();
        int first = 0 , second = 1;
        System.out.println("Fibonacci Series up to " + n + "terms : ");

        for(int i=1;i<=n;i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
