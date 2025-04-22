import java.util.Scanner;
public class string0 {
    public static void main(String[] args) {
        String str = "hello";
        //String str1 = "hii";

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        for(int i=str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}
