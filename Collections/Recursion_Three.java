public class Recursion_Three {
    static int Add(int n) {
        if (n >= 1 && n <= 9) {
            return n;
        }
        return Add(n / 10) + n % 10;

    }

    static int Count(int no) {
        if (no >= 1 && no <= 9)
            return 1;
        return Count(no / 10) + 1;
    }

    static int Pow(int p, int q) {
        if (q == 0)
            return 1;
        return Pow(p, q - 1) * p;
    }

    static int Pow_two(int p, int q) {
        if (q == 0)
            return 1;
        int small = Pow_two(p, q / 2);
        if (q % 2 == 0) {
            return small * small;
        }
        return p * small * small;
    }

    public static void main(String[] args) {
        System.out.println(Add(555));
        System.out.println(Count(556));
        System.out.println(Pow(5, 4));
        System.out.println(Pow_two(2, 5));
    }

}
