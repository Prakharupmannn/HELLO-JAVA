public class duplicate {
    public static void main(String[] args) {
        String str = "hiiiiiiieeeee";
        // String newstr = "";
        // for(int i=0;i<str.length();i++){
        // char ch = str.charAt(i);
        // if(newstr.indexOf(ch)==-1){
        // newstr=newstr+ch;
        // }
        // }System.out.println(newstr + " ");

        char arr[] = str.toCharArray();
        char c = arr[0];
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (arr[j] == c)
                        break;
                    System.out.println(arr[j]);
                    break;
                }

            }
            c = arr[i];
        }

    }
}
