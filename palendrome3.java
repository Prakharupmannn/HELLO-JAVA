import java.util.Scanner;

public class palendrome3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindrome = "sambhav";
        String rev = "";

        for(int i=palindrome.length()-1;i>=0;i--){
           
            rev += palindrome.charAt(i);}
            if(rev.equals(palindrome))
            System.out.println("its a palindrome string");
            else
            System.out.println("its not a palindrome string");
        
    }// System.out.println();
}
