public class acc {
    static void pattern() {
        int i, j;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + j);
            }
            System.out.println();
        }
    }

    static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern();
        pattern2();
        pattern3();

        // int count = 1;
        // for (int i = 0; i <= 100; i++) {
        // System.out.println("yash");
        // count++;
        // }
        // System.out.println(count);
    }

}
