public class sum {
    public static void main(String[] args) {
        
        int a=123;
        int d;
       // int original = a;
       // int res = 0;
        int sum = 0;
        while (a != 0) {
             d= a % 10;
            
            sum += d;
            a/=10;
          
            
        }  System.out.println(sum);
    }
}
