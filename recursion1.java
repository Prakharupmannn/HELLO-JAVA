//qs1- no. 5to1
// public class recursion1 {
//     public static void printNumb(int n) {
//         if(n == 0) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);//recursive calls itself  
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumb(n);//n=5
//     }
// }

//qs2- no. 1to5
// public class recursion1 {
//     public static void printNumb(int n) {
//         if(n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);//recursive calls itself  
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n);//n=1
//     }
// }

//qs3- sum of n naturals no.
// public class recursion1 {
//     public static void printSum(int i, int n, int sum) {
//         if(i == n) {//base case
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;//work
//         printSum(i+1, n, sum);
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//        printSum(1, 5, 0);
//     }
// }

// qs4- factorial of no.n
// public class recursion1 {
//     public static int calcfactorial(int n) {
//         if(n == 1 || n == 0){
//             return 1;
//         }
//        int fact_nm1 = calcfactorial(n-1);
//        int fact_n = n * fact_nm1;
//        return fact_n;
//     }
//     public static void main(String[] args) {
//        int n=5;
//        int ans = calcfactorial(n);
//        System.out.println(ans);
//     }
// }

//qs-4 print fabonacci series till nth term
// public class recursion1 {
//     public static void printfib(int a, int b, int n) {
//         if(n == 0) {
//             return;
//         }  
//         int c = a + b;
//           System.out.println(c);
//           printfib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a = 0 , b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 7;
//         printfib(a, b, n-2);
//     }
// }

//qs-5 Calculate power x^n
// public class recursion1 {
//     public static int calcPower(int x, int n) {
//         if(n == 0) {//base case 1
//             return 1;
//         }
//         if(x == 0) {
//             return 0;
//         }
//         int xPownm1 = calcPower(x, n-1); // work
//         int xPown = x * xPownm1;
//         return xPown;
//     }
//     public static void main(String[] args) {
//           int x=2, n=5;
//           int ans = calcPower(x, n);
//           System.out.println(ans);
//     }
// }

//qs-6  calculate x^n(logn)
public class recursion1 {
    public static int CalcPower(int x , int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        //if n is even
        if(n % 2 == 0) {
            return CalcPower(x, n/2) * CalcPower(x, n/2);
        }
        else {//for odd
            return CalcPower(x, n/2) * CalcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = CalcPower(x, n);
        System.out.println(ans);
    }
}