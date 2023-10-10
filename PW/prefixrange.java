import java.util.*;

public class prefixrange {
    static int[] makeprefix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no do you want to entered");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] presum = makeprefix(arr);
        System.out.println("enter the quries");
        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = presum[r] - presum[l - 1];
            System.out.println(ans);
        }
        
    }

}
