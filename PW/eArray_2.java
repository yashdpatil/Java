import java.util.*;

public class eArray_2 {
    static void no_ocuurance(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3)
                count++;
        }
        System.out.println(count);

    }

    static void last_ocuurance(int[] arr, int x) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3)
                last = i;
        }
        System.out.println(last);

    }

    static void strictly_ocuurance(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 3)
                count++;
        }
        System.out.println(count);

    }

    static boolean issorted(int[] arr) {
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                // break;
            }
        }

        System.out.println(check);
        return check;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        no_ocuurance(arr, 3);
        last_ocuurance(arr, 3);
        strictly_ocuurance(arr, 3);

        issorted(arr);
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // if (arr[i] == 3)
        // count++;
        // }
        // System.out.println(count);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
    }

}
