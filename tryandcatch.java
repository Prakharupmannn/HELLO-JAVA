public class tryandcatch {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 5;
            
        // try{
        //     int c = a/b;
        //     System.out.println(c);            
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("Zero cannot be divided by a");
        // }
        // System.out.println("hello");
        // System.out.println("byeee");

        int arr[] = {2,3,4,5};

        try {
            System.out.println(arr[8]);
        }
        catch (ArithmeticException e) {
            System.out.println("length is smaller");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("length is smaller then the value");
        }
        finally {
            System.out.println("hello");
        } 
    }
}
