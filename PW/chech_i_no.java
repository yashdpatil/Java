import java.util.*;

public class chech_i_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int n = sc.nextInt();
        // int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int k = sc.nextInt();
        int ans = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == i) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }

}
