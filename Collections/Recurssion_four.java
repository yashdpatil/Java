package Collections;

public class Recurssion_four {
    static void Pade(int p, int q) {
        if (q == 0) {
            return;
        }
        Pade(p, q - 1);
        System.out.println(p * q);

    }

    static int Natural(int n) {
        if (n == 0)
            return 0;
        return Natural(n - 1) + n;
    }

    // WE SHOULD DO
    // 1-2+3-4+5 =3;

    static int PlusandMinus(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0) {
            return PlusandMinus(n - 1) - n;
        }
        return PlusandMinus(n - 1) + n;
    }

    public static void main(String[] args) {
        // Pade(5, 3);
        System.out.println(Natural(10));
        System.out.println(PlusandMinus(5));

    }
}