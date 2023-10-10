import java.util.*;

public class Two_pointers {
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

    

    static void Sortzeros(int[] arr) {
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            zero++;

        }
        for (int i = 0; i < arr.length; i++) {
            if (zero > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Sortzeros(arr);
        printarray(arr);
        // int count = 0 ;

    }
}
