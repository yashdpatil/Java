public class Arraysum {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < a.length; i++) {
            // int sum = 0;
            sum = sum + a[i];
            // System.out.println(sum);

        }
        System.out.println(sum);
    }
}
