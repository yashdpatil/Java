public class Recursion_Four {
    static void Pade(int p, int q) {
        if (q == 0) {
            return;
        }
        Pade(p, q - 1);
        System.out.println(p * q);

    }

    public static void main(String[] args) {
        Pade(5, 3);

    }
}