import java.util.*;

public class Recurssion_pw_two {
    public static int Factorial(int N) {
        if (N == 0) {
            return 1;
        }
        int small = Factorial(N - 1);
        int ans = N * small;
        return ans;

    }

    public static int Fibbo(int num) {
        if (num == 0 || num == 1)
            return num;
        return Fibbo(num - 1) + Fibbo(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println(Fibbo(6));

    }
}