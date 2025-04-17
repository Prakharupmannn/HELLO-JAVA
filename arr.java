import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6};
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);}

        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the value of array");
        for (int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        // for(int j=0;j<arr.length;j++){
        //     System.out.print(arr[j]);
        // }

        //REVERSE OF AN ARRAY
        // for (int i=n-1;i>=0;i--){
        //     System.out.println(arr[i]);
        // }

        // int max = 0;
        // for (int j=0;j<n;j++) {
        //     if(arr[j]>max) {
        //         max=arr[j];
        //     }
           
        // } System.out.println( "max" + max);
   
        
}
}
