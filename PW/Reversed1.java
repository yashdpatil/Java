public class Reversed1 {
    public static void REV() {
        String s = "Hello";
        String s1 = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            s1 = ch + s1;

        }
        System.out.println(s1);

    }

    public static void main(String[] args) {
        String s = "Hello";
        int s1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                s1++;

            }
            // System.out.println(s1);

        }
        System.out.println(s1);
        REV();

    }

}
