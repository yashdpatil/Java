import java.util.*;

public class hashmap {
    public static void mGfg() {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);

        for (Integer x : arr)
            System.out.print(x + " ");

    }

    public static void MAke() {
        List<Integer> h1 = new ArrayList<Integer>();
        h1.add(20);
        h1.add(40);
        h1.add(60);
        h1.add(80);
        h1.add(100);

        // Iterator it = h1.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        Integer[] it = new Integer[h1.size()];
        it = h1.toArray(it);
        for (int in : it) {
            System.out.println(in);

        }

    }

    public static void main(String[] args) {
        mGfg();
        // MAke();
        HashMap<String, Integer> H1 = new HashMap<>();
        H1.put("Yash", 121);
        H1.put("Yah", 122);
        H1.put("Ysh", 123);
        H1.put("Yas", 121);
        System.out.println(H1);

        int value = H1.get("Yash");
        System.out.println(value);

        List<Integer> h2 = new ArrayList<Integer>();
        h2.add(10);
        h2.add(10);
        h2.add(10);
        h2.add(10);
        // System.out.println(h2);
        Iterator it = h2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Integer[] arr = new Integer[h2.size()];
        arr = h2.toArray(arr);

        for (Integer x : arr)
            System.out.print(x + " ");

    }
}
