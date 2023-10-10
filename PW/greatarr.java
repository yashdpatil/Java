public class greatarr {
    static void Smaller_arr() {
        int[] small = { 10, 5, 7, 6, 4, 45 };
        int ans = small[0];
        for (int i = 0; i < small.length; i++) {
            if (small[i] < ans) {
                ans = small[i];
            }

        }
        System.out.println("smallest no inarray is " + ans);

    }

    static void Large_arr() {
        int[] a = { 10, 20, 30, 40, 50, 5 };
        int ans = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] > ans) {
                ans = a[i];

            }

        }
        System.out.println("Largest no in array is " + ans);

    }

    public static void main(String[] args) {
        Smaller_arr();
        Large_arr();

    }

}
