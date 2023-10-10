import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(3));
        String a = "abc";
        String b = "xyZ";
        String str = "IIT Avasari";
        System.out.println(a.compareTo(b));
        System.out.println(a.concat(b));
        System.out.println(str.endsWith("ri"));
        System.out.println(str.contains("ri"));
        System.out.println(str.indexOf("I"));
        System.out.println(str.substring(0, 2));

        String st = "yash";
        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j <= 4; j++) {
                System.out.print(st.substring(i, j) + " ");
            }
        }

        // Stringbuilders it is used to for the avoid interncy,immmutability of string
        // Some Functtion

        String ss = "abcdefghij";
        StringBuilder stb = new StringBuilder(ss);
        System.out.println(stb.append(str));
        System.out.println(stb.charAt(0));
        System.out.println(stb.insert(0, "java"));
        System.out.println(stb.reverse());

    }

}
