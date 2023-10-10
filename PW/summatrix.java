import java.util.*;

public class summatrix {
    public static void printly(int[][] Sum) {
        for (int k = 0; k < Sum.length; k++) {
            for (int l = 0; l < Sum[k].length; l++) {
                System.out.print(Sum[l][k] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void Reversed(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            int start = 0;
            int end = c - 1;
            while (start < end) {
                int temp;
                temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int k = 0; k < r; k++) {
            for (int l = 0; l < c; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void Sum(int[][] arr, int r, int c, int[][] arr1, int l, int k) {
        if (r != c || l != k) {
            System.out.println("enter the valid input");
        } else {
            int[][] sum = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    sum[i][j] = arr[i][j] + arr1[i][j];

                }
                System.out.println();
            }
            System.out.println(" Resultant Matrix are");
            printly(sum);

        }
    }

    public static void Multiplication(int[][] arr, int r, int c, int[][] arr1, int l, int k) {
        if (c != k) {
            System.out.println("enter the valid input");
        } else {
            int[][] sum = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    for (int q = 0; q < k; q++)
                        sum[i][j] += arr[i][q] * arr1[q][j];

                }
                System.out.println();
            }
            System.out.println(" Resultant Matrix are");
            printly(sum);

        }
    }

    public static void Transpose(int[][] arr, int r, int c) {
        int[][] transpose = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = arr[j][i];
            }
            System.out.println();
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();// new line
        }
        // printly(transpose);
    }

    public static void rotatae_90(int[][] arr, int r, int c) {
        InplaceTran(arr, r, c);
        Reversed(arr, r, c);
    }

    public static void InplaceTran(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();// new line
        }
    }

    public static void Pascle(int n) {
        int[][] anss = new int[n][];
        for (int i = 0; i < n; i++) {
            //// For Row consideration of jagged array
            anss[i] = new int[i + 1];
            // Make 1st and last element are 111
            anss[i][0] = anss[i][i] = 1;
            for (int j = 1; j < i; j++) {
                anss[i][j] = anss[i - 1][j] + anss[i - 1][j - 1];
            }

        }
        for (int k = 0; k < anss.length; k++) {
            for (int l = 0; l < anss[k].length; l++) {
                System.out.print(anss[k][l] + " ");
            }
            System.out.println(" ");
        }
        // printly(anss);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no For pascle Trianagle");
        int n = sc.nextInt();
        // System.out.println("Enter the no of rows");
        // int r = sc.nextInt();
        // System.out.println("Enter the no of Colums");
        // int c = sc.nextInt();

        // int[][] arr = new int[r][c];
        // System.out.println("Enter the matrix");
        // for (int i = 0; i < r; i++) {
        // for (int j = 0; j < c; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        // 2nd Matrixxxx
        // System.out.println("Enter the no of rows");
        // int r1 = sc.nextInt();
        // System.out.println("Enter the no of Colums");
        // int c1 = sc.nextInt();
        // int[][] arr1 = new int[r1][c1];
        // System.out.println("Enter the matrix");
        // for (int k = 0; k < r1; k++) {
        // for (int l = 0; l < c1; l++) {
        // arr1[k][l] = sc.nextInt();

        // }

        // }
        // Multiplication(arr, r, c, arr1, r1, c1);
        // Reversed(arr, r, c);
        // Transpose(arr, r, c);/
        // InplaceTran(arr, r, c);/
        // rotatae_90(arr, r, c);
        Pascle(n);

    }
}
