public class Stringsb {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("tony");
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

        StringBuilder sb = new StringBuilder("h");
        sb.append("e");  //str = str + "e"
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb.length());
    }
}
