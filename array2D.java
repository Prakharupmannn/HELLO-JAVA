import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        // int[][] arr={{1,2,3,4},{5,6,7,8}};
        // for(int i=0;i<arr.length;i++) {
        //     for(int j=0;j<arr[i].length;j++) {
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }

    //     Scanner sc = new Scanner(System.in);
    //     int rows = sc.nextInt();
    //     int cols = sc.nextInt();

    //     int[][] numbers = new int[rows][cols];
        //inputs
    //     for(int i=0;i<rows;i++){
    //         for(int j=0;j<cols;j++){
    //             numbers[i][j] = sc.nextInt();
    //         }
    //     }
        //output
    //     for(int i=0;i<rows;i++){
    //         for(int j=0;j<cols;j++){
    //             System.out.print(numbers[i][j] + " ");
    //         }
    //         System.out.println();
    // }


    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            numbers[i][j] = sc.nextInt();
        }
    }
    int x = sc.nextInt();

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(numbers[i][j] == x){
                System.out.println("x found at locations (" + i + "," + j + ")");
            }
        }
    }
}
}
