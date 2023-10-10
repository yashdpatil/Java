import java.util.*;

public class Array_4 {
    static void Swap(int p, int q) {
        int temp;
        temp = p;
        p = q;
        q = temp;
        System.out.println("p " + p);
        System.out.println("q" + q);
        // System.out.println(r);

    }

    static void Swap2(int p, int q) {
        // int temp;
        p = p + q;
        q = p - q;
        p = p - q;
        System.out.println("p " + p);
        System.out.println("q" + q);
        // System.out.println(r);

    }

    static int[] makefre(int[] arr) {
        int[] fr = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            fr[arr[i]]++;
        }
        return fr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int p = sc.nextInt();
        int q = sc.nextInt();
        // int r = sc.nextInt();
        int x = sc.nextInt();
        // Swap(p, q);
        // Swap2(p, q);
        makefre(null);

    }

}
