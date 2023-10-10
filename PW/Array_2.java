import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
    static void print_Arr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    /// Sucessfully printed Arrays
    static void clonee(int[] arr) {
        int arr2[] = arr.clone();
    }

    // ??unsucessufully copied arrays printed array
    static void unsu_clonee(int[] arr) {
        int arr_3[] = arr;
    }

    static void copiesof(int[] arr) {
        int[] arr_4 = Arrays.copyOf(arr, arr.length);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no that you enteed");
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the no");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        copiesof(arr);
        print_Arr(arr);
        // unsu_clonee(arr);
        // clonee(arr);
        // copiesof(arr);

        // for (int i : arr) {
        // System.out.println();
        // System.out.println(arr[i]);

        // }
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);

        // }

    }
    // in java.util package contain the
    // the 2 method
    // copyOf(arr nmae )
    // copyOfranges
    //
}
