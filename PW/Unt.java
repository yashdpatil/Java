import java.util.*;

public class Unt {
    public static void main(String[] args) {
        String str = "abcabda";
        char ch[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            count = 1;
            for (int j = i + 1; j < ch.length - 1; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count > 1) {
            System.out.println(ch[i]);
        }
        }
    }   
    }
