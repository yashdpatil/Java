public class Recurssion_Five {
    public static int ItterGcd(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;

        }
        return y;
    }

    public static int ItterLcm(int x, int y) {
        int mult = x * y;
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;

        }

        return mult / y;
    }

    public static int EuGCD(int x, int y) {
        // gcd(x,y) = gcd(y,x%y)
        // gcd(x,0) = x;00
        if (y == 0)
            return x;
        return EuGCD(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(ItterGcd(15, 24));
        System.out.println(EuGCD(15, 24));
        System.out.println(ItterLcm(15, 24));
    }
}
