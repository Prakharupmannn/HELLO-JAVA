public class subsequences {
    public static void subsequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be choosen
        subsequences(str, idx+1, newString+currChar);

        //not to be choosen
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
