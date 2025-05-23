public class class4 {
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5};
    //     int lastvalue = arr[arr.length-1];
    //     for(int i=arr.length-1;i>0;i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0] = lastvalue;
    //     for (int k : arr) {
    //         System.out.println(k);
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "heeelllloooo";
    //     String str1 = "";
    //     for(int i=0;i<str.length();i++) {
    //         char c=str.charAt(i);
    //         if(str1.indexOf(c) == -1){
    //             str1 += c;
    //         }
    //     }
    //     System.out.println("compressed string" + str1);
    // }

    public static void main(String[] args) {
        String str = "aaabbbcccc";
        StringBuilder newstr = new StringBuilder();
        int count = 1;
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i)==str.charAt(i-1)){
                count ++;
            } else{
                newstr.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        } System.out.println(newstr);
    }
}
