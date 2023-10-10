public class serching_arr {
    static void element_arr() {
        int[] small = { 10, 5, 7, 6, 4, 45 };
        int ans = 45;
        int key = -1;
        for (int i = 0; i < small.length; i++) {
            if (small[i] == ans) {
                // ans = small[i] - 1;
                key = i;
            }

        }
        System.out.println("array va,ue is in is " + key);

    }

    static void double_arr() {
        int[] small = { 10, 5, 7, 6, 4, 45, 6 };
        int ans = 6;
        int key = -1;
        for (int i = 0; i < small.length; i++) {
            if (small[i] == ans) {

                key = i;
                break;
            }

        }
        if (ans == -1) {
            System.out.println(" not found");

        } else {

            System.out.println("array va,ue is in is " + key);
        }
    }

    public static void main(String[] args) {
        element_arr();
        double_arr();
    }

}
