import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Arraylist {
    static void Reversed(ArrayList<Integer> al) {
        int i = 0;
        int j = al.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(al.get(i));
            al.set(i, al.get(j));
            al.set(j, temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        al.add(600);
        // Reversed(al);
        Collections.reverse(al);
        System.out.println(al);

        // Reversed list Using the reversed order
        System.out.println(" Decending Order \n");
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);

        ArrayList<String> sal = new ArrayList<>();
        sal.add("yash");
        sal.add("ram");
        sal.add("vo");
        Collections.sort(sal);
        System.out.println(sal);

    }
}
