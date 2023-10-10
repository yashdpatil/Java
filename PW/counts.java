import java.util.Scanner;

public class counts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int countnos = 0;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;

            countnos++;
        }
        System.out.println(sum + " ");
        System.out.println(countnos + " ");
    }

}
