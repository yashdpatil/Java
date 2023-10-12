//  Basic Logic for sorting 
import java.util.Arrays;
// Comparable  Interface :
// //  if we  want to sort non  primitive type then we usee Comparable interface.
// It is on java.lang pkg;
// T->the type of object may compared  to
public class Itreable_and_Itreator implements Comparable<Itreable_and_Itreator> {
    int id;
    String name;

    Itreable_and_Itreator(int id, String name) {
        this.name = name;
        this.id = id;
    }
    // Method : -
// int compareTo(T other)
// {
//     return (+) : calling object is greater than specified object.abstract   
//     return(-) : calling of is less than specified object;
//     return 0 : Both object are equal.
// }

    public int compareTo(Itreable_and_Itreator other) {
    return this.id - other.id;
    }
    public int compareTo(Itreable_and_Itreator other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " " + id;
    }

    public static void main(String[] args) {
        int arr[];
        Itreable_and_Itreator ii[] = new Itreable_and_Itreator[2];
        ii[0] = new Itreable_and_Itreator(20, "Anil");
        ii[1] = new Itreable_and_Itreator(10, "Book");
        Arrays.sort(ii);
        for (Itreable_and_Itreator element : ii) {
            System.out.println(element);
        }

    }

}
// Bassic Interfaces
// java.lang.AutoCloseable
// java.io.Closeable
// java.lang.Cloneable
// java.lang.Comparable
// java.util.Comparator
// java.lang.Iterable
// // java.util.Iterator

