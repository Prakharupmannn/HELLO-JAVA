// public class java4 {
//     static void sum(int a , int b){
//         int sum = a + b;
//         System.out.println(sum); 
//     }
     
//     public static void main(String[] args) {
//         sum(5, 3);
//     }
// }


// public class java4 {
//     static int sum(int a ){
//         return a;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(123));
//     }
// }


public class java4 {
//     static int sum(int a){
//         int sum = 0;
//         while(a>0){
//             int digit = a%10;
//             a=a/10;
//             sum+=digit;
//         }return sum;
//     }
//     static void maxsum(int a , int b){
//         int sum = a+b;
//         int max =0;
//         while(sum>0){
//             int c = sum % 10; 
//             if(c>max){
//                 max=c;
//             }
//             sum /= 10;      
//         }
//         System.out.println(max);
//         }

//     public static void main(String[] args) {
//         // System.out.print("sum is " + sum(123));
//         maxsum(210,6);      

int a = 12;//instant varaible
static int b = 10;//static varaible
public static void main(String[] args) {
    java4 obj = new java4();
    System.out.println(obj.a);
    System.out.println(b);
}
}
