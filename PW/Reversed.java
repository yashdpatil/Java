public class Reversed {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;
        int ans = 0;
        while (num > 0) {
            ans = (ans * 10) + (num % 10);
            num /= 10;
        }
        System.out.println(" Reversed no is" + ans);

        if (temp == ans)
            System.out.println("palindrom");
        else
            System.out.println("not");

    }

}
