public class maxsubarray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,5,-1,0,4};
        try {
            int max1 = -1; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1) {
                max1 = arr[i];
                if(i==max1){
                    i++;
                }else if(arr[i] > max1){
                    max1 = i;
                }
            }
        } int max2 = -1;
        for(int i=0;i<arr.length;i++) { 
            if(arr[i]>max2 && arr[i]<=max1) {
                max2 = arr[i];
                if(i==max1){
                    i++;
                } else if(arr[i] > max2) {
                    max2 = i;
                }
            }
        } int max3 = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max3 && arr[i]<=max1 && arr[i]<=max2)
            max3 = arr[i];
            if(i==max2){
                i++;
            } else if(arr[i] > max3){
                max3 = i;
            }
        }
        System.out.println(max1+max2+max3);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("elements are greater than the value of arr");
        }
        
    }
}
