class Arrays_1 {
    public static void main(String[] args) {
        int[] a = { 20, 30, 40, 50, 60, 70 };
        int[][] b = { { 20, 30, 10 }, { 40, 50, 60 } };
        // for (int i = 0; i < 3; i++) {
        // System.out.println(a[i]);
        // }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++)
                System.out.println(b[i][j]);
        }
        // for (int i : a) {
        // System.out.println(i);
        // }

    }
}