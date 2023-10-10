import java.util.*;

public class List_PW {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(9);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        // PRINTING THE LIST
        System.out.println(l1); // in list format [5, 6, 7, 9]

        // Adding Element on i th POSITION
        l1.add(1, 200);
        System.out.println(l1);

        // MODifying the element at index i
        l1.set(1, 100);
        System.out.println(l1);

        // Removing the Element At i
        l1.remove(1);
        System.out.println(l1);

        // removing the element on element
        l1.remove(Integer.valueOf(5));
        System.out.println(l1);

        /// Checking the element exist or not
        boolean ans = l1.contains(Integer.valueOf(9));
        System.out.println(ans);

        // if you don't specify class, you can put anything inside
        ArrayList l = new ArrayList();
        l.add("kdeiu");
        l.add(20);
        l.add(true);
        System.out.println(l);

    }

}