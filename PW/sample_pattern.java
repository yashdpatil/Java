public class sample_pattern {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + n; j++) {
                System.out.println("x");
            }
        }
    }

}
