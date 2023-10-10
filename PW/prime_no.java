import java.util.*;

public class prime_no {

    public void prim() {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Prime no");
        } else {
            System.out.println("not a prime no");
        }

    }

    public static void main(String[] args) {
        prime_no p1 = new prime_no();
        
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime no");
        } else {
            System.out.println("not a prime no");
        }
        p1.prim();

    }

}
