public class maxsubarray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,5,-1,0,4};
        try {
            int max1 = 0; 
            int index1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1) {
                max1 = arr[i];
                index1=i;
            }
        } int max2 = 0;
        int index2 = 0;
        for(int i=0;i<arr.length;i++) { 
          if(i!=index1){
            if(arr[i]>max2) {
                max2 = arr[i];
                index2=i;
            }
        }
        } int max3 = 0;int index3 = 0;
        for(int i=0;i<arr.length;i++){
            if(i!=index1&&i!=index2){
            if(arr[i]>max3)
            max3 = arr[i];
            index3=i;
        }
    }
        System.out.println(max1+ " " +max2+ " " +max3);
        System.out.println(max1 + max2 + max3);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e + "Invalid output");
        }
        
    }
}
