
import java.util.*;
import java.text.*;

public class sam {
    static void cal(double nn, double n1)

    {
        if (nn > 0 && n1 > 0) {
            DecimalFormat df1 = new DecimalFormat("0.00");
            System.out.println(df1.format((nn / 150) * 100));
            System.out.println(df1.format((n1 * 0.6214) / (nn * 0.2642)));
        } else {
            System.out.print(nn + "has Invaild input");
        }
    }

    static void inputinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of pizzas bought");
        int pizzas = sc.nextInt();
        System.out.println("enter the no of puffs bought");
        int puff = sc.nextInt();
        System.out.println("enter the no of Cold Drinks bought");
        int colddrink = sc.nextInt();

        // Scanner sc = new Scanner(System.in);

        System.out.println("Bill Details");

        System.out.println("enter the no of pizzas bought :" + pizzas);
        // int pizzas = sc.nextInt();
        System.out.println("enter the no of puffs bought :" + puff);
        // int puff = sc.nextInt();
        System.out.println("enter the no of Cold Drinks bought :" + colddrink);
        // int colddrink = sc.nextInt();

        System.out.println("Total price =" + ((pizzas * 100) + (puff * 20) + (colddrink * 20)));
        System.out.println("ENJOY THE SHOW !!!");

    }

    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        // System.exit(0);
        inputinfo();
        // int n = sc.nextInt();
        // double nn = (n * 1.00);

        // System.out.println(nn);

        // double n1 = sc.nextInt();
        // // double nn = 13.333333334;
        // // System.out.println(df2.format(nn));

        // cal(nn, n1);

    }
}
