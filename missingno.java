public class missingno {
    static int missingno(){
        int arr1[] = {1,2,3,5};
       int n=5;
       int s=n*(n+1)/2;
       int sum=0;
       for(int i=0;i<arr1.length;i++){
             sum+=arr1[i];
       }
       int d=s-sum;
       //System.out.println("Missing digit:"+d);
       return d; 
       
    }

    public static void main(String[] args) {
        System.out.println(missingno());
    }
}
