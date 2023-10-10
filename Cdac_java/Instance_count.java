public class Instance_count {
    static int count = 0;

    Instance_count() {
        count++;

    }

    static int retCount() {
        return count;
    }

    public static void main(String[] args) {
        Instance_count ic = new Instance_count();
        Instance_count ics = new Instance_count();
        Instance_count icss = new Instance_count();
        Instance_count icsss = new Instance_count();
        System.out.println(count);
        System.out.println(retCount());

    }
}
