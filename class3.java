public class class3 {
    public static void printArray(String str[]) {
        for(int i=0;i<str.length;i++){
            System.out.println(str[i] + " ");      
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        String str[] = {"D","B","A","C"};  

        for(int i=0;i<str.length-1;i++){
            for(int j=0;j<str.length-i-1;j++){
                if((int)str[j].charAt(0) > (int)str[j+1].charAt(0)) {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        printArray(str);
       
    }
}
