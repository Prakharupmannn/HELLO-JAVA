public class smallestnoarray {
    static int smallestnoarray(){
        int arr[] = {1,2,3,4,5};
        int small = arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            } 
        }
    return small;
    }
    public static void main(String[] args) {
        System.out.println(smallestnoarray());
    }
}
