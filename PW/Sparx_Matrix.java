import java.util.*;

public class Sparx_Matrix {
    public static void printly(int[][] sparx, int r, int c) {
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < sparx[k].length; l++) {
                System.out.print(sparx[l][k] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void sparx(int[][] arr, int r, int c) {
        int top_row = 0, bottomRow = r - 1, leftcol = 0, rightcol = c - 1;
        int total = 0;
        while (total < r * c) {
            // top_row = leftcol to rightcol
            for (int j = leftcol; j <= rightcol && total < r * c; j++) {
                System.out.println(arr[top_row][j]);
                total++;
            }
            top_row++;
            // rightcol=top_row-bottomRow
            for (int i = top_row; i <= bottomRow && total < r * c; i++) {
                System.out.println(arr[i][rightcol]);
                total++;
            }
            rightcol--;
            // bottomRow=rightcol-leftcol
            for (int j = rightcol; j >= leftcol && total < r * c; j--) {
                System.out.println(arr[bottomRow][j]);
                total++;
            }
            bottomRow--;
            // leftcol=bottomRow - top_row
            for (int i = bottomRow; i >= top_row && total < r * c; i--) {
                System.out.println(arr[i][leftcol]);
                total++;

            }
            leftcol++;

        }
        // printly(arr, r, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the no For pascle Trianagle");
        // int n = sc.nextInt();
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();
        System.out.println("Enter the no of Colums");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sparx(arr, r, c);

    }

}
