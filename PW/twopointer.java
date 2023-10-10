import java.util.*;

public class twopointer {

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortzeorsandone(int[] arr) {
        int zero = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zero++;

        }
        for (int i = 0; i < n; i++) {
            if (i < zero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void sortbyswap(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (arr[l] == 1 && arr[r] == 0) {
                swap(arr, l, r);
                l++;
                r--;
            }
            if (arr[l] == 0) {
                l++;
            }
            if (arr[r] == 1) {
                r--;
            }
        }

        // printarray(arr);
    }

    static void sortoddeven(int[] arr) {
        int left = 0;
        int n = arr.length;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
            // printarray(arr);
        }

    }

    static void sortodd(int[] arr) {
        int left = 0;
        int n = arr.length;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 0 && arr[right] % 2 == 1) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 1) {
                left++;
            }
            if (arr[right] % 2 == 0) {
                right--;
            }

        }
        // printarray(arr);

    }

    static void sortsquare(int[] arr) {
        int n = arr.length;
        int ans = 0;

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            arr[i] *= arr[i];

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // sortzeorsandone(arr);
        // sortbyswap(arr);
        // sortoddeven(arr);
        // sortodd(arr);
        // sortsquare(arr);
        // printarray(arr);
        Collections.reverse(Arrays.asList(arr));
        // printarray(arr);
        System.out.println(Arrays.asList(arr));

    }

}
