package Collections;

public class Recu_array {
    static void print_arr(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.println(arr[i]);
        print_arr(arr, i + 1);

    }

    static int MAX_array(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];
        int small = MAX_array(arr, i + 1);
        return Math.max(arr[i], small);
    }

    static int MIN_array(int[] arr, int i) {
        if (i == arr.length - 1)
            return arr[i];
        int small = MAX_array(arr, i + 1);
        return Math.min(arr[i], small);
    }

    static int Sum_arr(int[] arr, int i) {

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        print_arr(arr, 0);
        System.out.println("MAX ELEMENT IS" + MAX_array(arr, 0));
        System.out.println("MIN ELEMENT IS" + MIN_array(arr, 0));
    }

}
