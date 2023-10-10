public class cuntnos {
    public static void main(String[] args) {

        int n = 123;
        int c = 0;
        while (n > 0) {
            // n /= 10;
            c += n % 10;
            // c++;

            // System.out.print("" + c);
        }
        System.out.println(c);

    }

}
