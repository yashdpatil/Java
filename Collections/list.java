package Collections;

import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> L1 = new ArrayList<>();
        L1.add(22);
        L1.add(23);
        L1.add(24);
        L1.add(25);
        L1.add(26);
        L1.set(0, 105);
        Iterator<Integer> it = L1.iterator();
        for (int x : L1) {
            System.out.print(x + ",");
        }

        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
