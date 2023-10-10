import java.util.*;

public class Targetsum {
    static void Targetsum1(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        // return ans;
        System.out.println(ans);

    }

    static void Targetsum2(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++)
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
            }
        }
        // return ans;
        System.out.println(ans);

    }

    // PAttern :: ARRRAYS MANUPULATION
    static void Uniqueoccu(int[] arr) {
        int n = arr.length;
        // int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];

                // System.out.println(ans);
            }
        }
        System.out.println(ans);

    }

    static int largestk(int[] arr)

    {
        // int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                // System.out.println(arr[i]);
                mx = arr[i];

            }

        }
        return mx;
        // / System.out.println(mx);
    }

    static int secondlargest(int[] arr) {
        int mx = largestk(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int selarg = largestk(arr);
        return selarg;
        // System.out.println(selarg);
    }

    /// RETURN THE FIRST REPEATED NUMBER
    static int repeat(int[] arr) {
        int ans = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // return arr[i];
                    ans = arr[i];
                }
            }
        }
        return ans;
    }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversed(int[] arr, int i, int j) {
        // int i = 0;
        // int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    static void rotate(int[] arr) {
        int n = arr.length;
        int k = 3;
        k = k % n;
        reversed(arr, 0, n - k - 1);
        reversed(arr, n - k, n - 1);
        reversed(arr, 0, n - 1);

    }

    static int[] makefre(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

        }
        return freq;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int n = sc.nextInt();
        // int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        Targetsum1(arr, 7);
        Targetsum2(arr, 12);
        Uniqueoccu(arr);
        // largestk(arr);
        // System.out.println(secondlargest(arr));
        // System.out.println(repeat(arr));

        // reversed(arr);
        // rotate(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);
        // }
        int[] freq = makefre(arr);
        System.out.println("enter the quries");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("enter the no to be serched");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            q--;
        }

    }

}
