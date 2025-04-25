public class Stringsb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        // System.out.println(sb);

        //char at index 0
       // System.out.println(sb.charAt(3));

        //set char at index 0
        // sb.setCharAt(0, 'w');
        // System.out.println(sb);

        //insert at 0
        // sb.insert(2, 'n');
        // System.out.println(sb);

        // delete
        // sb.delete(0, 2);
        // System.out.println(sb);

        //StringBuilder sb = new StringBuilder("hello");
        // sb.append("e");  //str = str + "e"
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb.length());


        // reverse of any name
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 - i;//5-1-0

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }System.out.println(sb);


        // String original = "hello";
        // String reversed = "";

        // for(int i=original.length()-1;i>=0;i--){
        //     reversed += original.charAt(i);
        // }
        // System.out.println("reversed string: " + reversed);
    }
}
