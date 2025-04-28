public class targetarr {
    public static int targetarr(int arr[] , int target) {      
         for(int i=0;i<arr.length;i++){
            if(arr[i] == target) {
                return i;
            } 
        }return -1;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,7,5,6};
       int target = 3;
       int result = targetarr(arr, target);
       if(result == -1) {
        System.out.println("target is not same");
       } else{
        System.out.println("target is same");
       }
    }
}
