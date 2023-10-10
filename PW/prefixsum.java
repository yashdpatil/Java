import java.util.*;

public class prefixsum {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] prefixadd(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }
        return prefix;

    }

    static int prefixaddwithoutnew(int[] arr) {
        int n = arr.length;

        int ans = 0;
        // int[] prefix = new int[n];
        // prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printarray(arr);
        // int[] prefix = prefixadd(arr);
        // printarray(prefi);
        prefixaddwithoutnew(arr);
        printarray(arr);
        // System.out.println("enter the que");
        // int q = sc.nextInt();
        // while (q-- > 0) {
        // int l = sc.nextInt();
        // int r = sc.nextInt();
        // int ans = prefix(r) - prefix(l - 1);
        // System.out.println("value is" + ans);

    }

}
