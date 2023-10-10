import java.util.*;

public class Array2D {
    public static void printly(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void input(int[][] arr1) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rowss");
        int r = sc.nextInt();
        System.out.println("enter the Cols")
       int c = sc.nextInt();
         int[][] arr1 = new int[r][c]

        
        input(arr1);
        printly(arr1);

    }

}
