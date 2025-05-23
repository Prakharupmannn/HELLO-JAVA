public class recsorted {
//     public static boolean isSorted(int arr[], int idx) {
//         if(idx == arr.length-1) {
//             return true;
//         }
//         if(arr[idx] < arr[idx+1]) {
//             //array is sorted till now
//             return isSorted(arr, idx+1);
//         } else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,7,8,9};
//         System.out.println(isSorted(arr, 0));     
//     }

//     public static void moveallx(String str, int idx, int count, String newString) {
//         if(idx == str.length()) {
//             for(int i=0; i<count; i++) {
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x') {
//             count++;
//             moveallx(str, idx+1, count, newString);
//         } else{
//             newString += currChar;
//             moveallx(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveallx(str, 0, 0, "");
//     }

public static boolean[] map = new boolean[26];
public static void removeDuplicates(String str, int idx, String newString) {
    if(idx == str.length()) {
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar - 'a']) {
        removeDuplicates(str, idx+1, newString);
    }else {
        newString += currChar;
        map[currChar - 'a'] = true;
        removeDuplicates(str, idx+1, newString);
    }
}
public static void main(String[] args) {
    String str = "abbccda";
    removeDuplicates(str, 0, "");
}


}
