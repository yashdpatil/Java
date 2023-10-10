import java.util.*;

public class d_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr1 = new int[r][c];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; i++) {
                arr1[i][j] = sc.nextInt();
            }
        }

    }

}
