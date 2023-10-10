public class hashmap_Duplicate {
    public static void main(String[] args) {
        String dstring = "yyys";
        char c[] = dstring.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            count = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j] && c[i] != ' ') {
                    count++;
                    c[j] = 0;

                }
            }
            if (count > 1 && c[i] != ' ') {
                System.out.println(c[i] + " " + count);
            }
        }
    }
}
