import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
    //    int[] marks = new int[3];
    //    marks[0] = 97;
    //    marks[1] = 98;
    //    marks[2] = 99;
    //    for(int i=0;i<3;i++){
    //     System.out.println(marks[i]);
    //    }


    //linear search
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];

    for(int i=0;i<size;i++){
        numbers[i] = sc.nextInt();
    }

    int x = sc.nextInt();

    for(int i=0;i<numbers.length;i++){
       if(numbers[i] == x) {
        System.out.println("found at index : " + i);
       }
    }
     }
}
