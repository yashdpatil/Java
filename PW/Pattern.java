public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i--) {
            for (int j = 1; j <= 6 - 1 - i; j++) {
                System.out.print("x");
                // System.out.println();

            }
            System.out.println();
        }
        // System.out.println();
    }

}
